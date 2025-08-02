package src.SpringBootBasic.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.repositories.interfaces.IProductRepository;

@Repository
public class ProductRepository implements IProductRepository {
  
  @Override
  public ProductEntity createProduct(ProductEntity product) {
    ProductEntity newProduct = new ProductEntity();
    newProduct.setId(1L);
    newProduct.setName("Dannis D Nguy3n");
    newProduct.setPrice(100.0);
    return newProduct; 
  }

  @Override
  public List<ProductEntity> getAllProducts() {
    ProductEntity newProduct = new ProductEntity();
    newProduct.setId(1L);
    newProduct.setName("Dannis D Nguy3n List");
    newProduct.setPrice(300.0);    
    return List.of(newProduct);
  }

}
