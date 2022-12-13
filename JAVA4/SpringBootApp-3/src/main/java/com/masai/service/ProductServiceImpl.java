package com.masai.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
//import com.masai.model.Category;
import com.masai.model.Product;
import com.masai.model.ProductDTO;

import com.masai.repository.ProductDao;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao dao;
	
	
	@Override
	public Product registerProduct(Product p) throws ProductException {
		Product newProduct = dao.save(p);
		
		// TODO Auto-generated method stub
		return newProduct;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> list = dao.findAll();
		
		if(list.size()==0) {
			throw new ProductException("no student found...");
		}else {
			return list;
		}
		
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
		Optional<Product> lst = dao.findById(p.getProductId());
		if(lst.isPresent()) {
			Product updateProduct = dao.save(p);
			return updateProduct;
		}else {
			throw new ProductException("Invalid Student details..");
		}
		
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		
		Optional<Product>optional = dao.findById(pid);
		if(optional.isPresent()) {
			Product existingStudent = optional.get();
			
			dao.delete(existingStudent);
			return existingStudent;
			
			
		}
		// TODO Auto-generated method stub
		else {
			throw new ProductException("no Product is persent with product id :"+pid);
		}
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {

		
		return null;
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		List<ProductDTO> dtos = dao.getProductNameQtyPrice12();
		if(dtos.isEmpty()) {
			throw new ProductException("their is the error in list to retrive");
		}else {
			
			return dtos;
		}
	}


}
