package src.SpringBootBasic.services.interfaces;

import java.util.List;

import src.SpringBootBasic.entities.ProductEntity;

public interface ProductService {
  ProductEntity createProduct(ProductEntity product);
  List<ProductEntity> getAllProducts();
}
