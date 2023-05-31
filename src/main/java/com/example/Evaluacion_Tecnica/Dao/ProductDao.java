package com.example.Evaluacion_Tecnica.Dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.Evaluacion_Tecnica.Model.Product;



public interface ProductDao {
	
	Product getProdruct(@PathVariable Long productId);
	
	List<Product> DetalleProduct(Product p);

}
