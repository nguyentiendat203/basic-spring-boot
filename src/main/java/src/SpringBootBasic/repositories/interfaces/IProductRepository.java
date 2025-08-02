package src.SpringBootBasic.repositories.interfaces;

import java.util.List;

import src.SpringBootBasic.entities.ProductEntity;

public interface IProductRepository {
  ProductEntity createProduct(ProductEntity product);
  List<ProductEntity> getAllProducts();
}
