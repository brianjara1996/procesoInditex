package com.example.Evaluacion_Tecnica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Evaluacion_Tecnica.Dao.ProductDao;
import com.example.Evaluacion_Tecnica.Model.Product;


@RestController
public class ProductController  implements ProductDao {
	
	
	@Autowired
	private ProductDao productdao;
	
	
	
	 @RequestMapping(value = "/producto/{productId}/similar" , method = RequestMethod.POST)
	 public List<Product> DetalleProducto(@PathVariable Long productId) {
		 
		 try {
			 // Instacio el objeto producto 
			 Product p = new Product();
			 
			 //Voy a buscar todos los datos del producto por el productId que recibo por parametro
			 p = productdao.getProdruct(productId);
			 
             // Retorno una lista de todos los productos  similares al producto que recibo
			 return productdao.DetalleProduct(p);
		 }
		 catch(Exception e) {
			 return null;
		 }

	 }



	@Override
	public Product getProdruct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Product> DetalleProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

}
