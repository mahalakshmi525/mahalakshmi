import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Product } from '../models/product.model';



@Component({
  selector: 'app-product-entry',
  templateUrl: './product-entry.component.html',
  styleUrls: ['./product-entry.component.css']
})
export class ProductEntryComponent implements OnInit {

  @Output()
  submit_info : EventEmitter<Product>;

  constructor() { 
    
    this.submit_info = new EventEmitter();
  }

  ngOnInit() {
  }

  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));
    this.submit_info.emit(product);
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}

}
