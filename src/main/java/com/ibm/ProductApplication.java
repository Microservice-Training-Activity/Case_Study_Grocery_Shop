package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.ibm.model.Cart;
import com.ibm.model.Product;
import com.ibm.repository.CartRepository;
import com.ibm.service.CartService;
import com.ibm.service.ProductService;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	@Autowired
	ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		productService.addProduct(new Product(1,"Tomato","vegetables",20L));
		productService.addProduct(new Product(2,"Potato","vegetables",30L));
	}

}
