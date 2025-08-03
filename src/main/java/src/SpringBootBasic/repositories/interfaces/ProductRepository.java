package src.SpringBootBasic.repositories.interfaces;

import src.SpringBootBasic.entities.ProductEntity;

import java.util.List;

public interface ProductRepository {
  ProductEntity createProduct(ProductEntity product);
  List<ProductEntity> getAllProducts();
}
