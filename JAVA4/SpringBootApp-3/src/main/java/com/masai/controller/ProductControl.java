package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductService;

@RestController
public class ProductControl {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/products")
	public ResponseEntity<Product> registerProductHandler(@RequestBody Product product){
		Product registerProduct = service.registerProduct(product);
		return new ResponseEntity<Product>(registerProduct,HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> listOfProducts(){
		List<Product> list = service.getAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/products")
	public ResponseEntity<Product> updateProductHandler(@RequestBody Product product){
		Product productUpdated = service.updateProdcut(product);
		return new ResponseEntity<Product>(productUpdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("pid")Integer pid){
		Product deletedProduct = service.deleteProductById(pid);
		return new ResponseEntity<Product>(deletedProduct,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/productDto")
	public ResponseEntity<List<ProductDTO>> listOfProductDTO(){
		List<ProductDTO> list = service.getProductNameQtyPrice();
		return new ResponseEntity<List<ProductDTO>>(list,HttpStatus.OK);
	}
}
