package br.com.mp.product.api.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import br.com.mp.product.api.model.Product;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product>{

	public List<Product> list(){
		return listAll();
	}
	
	@Transactional
	public Product save(Product product) {
		persist(product);
		return product;
	}
	
	@Transactional
	public Product update(Long id, Product product) {
		Product productEntity = findById(id);
		
		productEntity.setNome(product.getNome());
		productEntity.setMarca(product.getMarca());
		productEntity.setPreco(product.getPreco());
		persist(productEntity);
		return productEntity;
		
	}
	
	@Transactional
	public void remove(Long id) {
		Product productEntity = findById(id);	
		delete(productEntity);
	}
	
}
