package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.mavenweb.entity.Product;
import com.cts.training.mavenweb.exception.ProductErrorResponse;
import com.cts.training.mavenweb.exception.ProductNotFoundException;
import com.cts.training.mavenweb.services.IProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	// dependency
	@Autowired
	private IProductService productService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/products") // GET HTTP VERB
	public List<Product> exposeAll() {
		
		List<Product> products = this.productService.findAllProducts();
		
		return products;
	}
	
	// {<data variable>}
	@GetMapping("/products/{productId}") // GET HTTP VERB
	public Product getById(@PathVariable Integer productId) {
		
		Product product =  this.productService.findProductById(productId);
		if(product == null)
			throw new ProductNotFoundException("Product with id-" + productId + " not Found");
		return product;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/products") // POST HTTP VERB
	public Product save(@RequestBody Product product) {
		this.productService.addProduct(product);
		return product;
	}
	
	@PutMapping("/productss")
	public Product saveUpdate(@RequestBody Product product) {
		this.productService.updateProduct(product);
		return product;
	}
	
	@DeleteMapping("/products/{productId}")
	public Product delete(@PathVariable Integer productId) {
		
		Product product = this.productService.findProductById(productId);
		
		// send studentId to DAO via SERVICE
		this.productService.deleteProduct(productId);
		
		return product;
	}
	
	// for exception handling
	@ExceptionHandler  // ~catch
	public ProductErrorResponse productNotFoundHandler(ProductNotFoundException ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		return error;
	}
	
	
	
	/************ REST endpoints ************/
	// /api/student [GET]
	// /api/student/id [GET]
	// /api/student [POST]
	// /api/student [PUT]
	// /api/student/id [DELETE]
	
	
	
	
}
