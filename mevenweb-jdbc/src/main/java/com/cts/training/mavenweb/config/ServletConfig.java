package com.cts.training.mavenweb.config;

import java.sql.DriverManager;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.training.mavenweb")



public class ServletConfig {
	
	@Autowired
	private Environment env;

	@Bean
	public DataSource datasSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(this.env.getProperty("jdbc.driver"));
		dataSource.setDriverClassName(this.env.getProperty("jdbc.url"));
		dataSource.setDriverClassName(this.env.getProperty("jdbc.user"));
		dataSource.setDriverClassName(this.env.getProperty("jdbc.password"));
		
		return  dataSource;
		
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// inject dependency
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
