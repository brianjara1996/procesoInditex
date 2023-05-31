package com.example.Evaluacion_Tecnica.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.Evaluacion_Tecnica.Model.Product;



@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	
    @PersistenceContext
   private EntityManager entityManager;

	@Override
	public Product getProdruct(Long productId) {
		try {
						
			//Instancio la clase producto para llenarla con la query mas abajo
			Product p = new Product();
			
			//ejecuta la busqueda de un producto por Id que recibo por parametro
			p = entityManager.find(Product.class, productId);
			
			return p;
			
		}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<Product> DetalleProduct(Product p) {

			try {
				//Query para buscar productor relacionados
				String query = "From Product where identificación = '" + p.getIdentificacion() + "' and disponibilidad = 1   and precio like " + p.getPrecio();

				//Traigo todos los productos relacionados y los ordeno en una lista
				List<Product> result =  entityManager.createQuery(query).getResultList();
				
				return result;
				
			}
			catch(Exception e)
			{
				System.out.println("Error: " + e);		
			
				return null;
			}
			

		
	}

}