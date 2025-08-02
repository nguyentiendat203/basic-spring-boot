package src.SpringBootBasic.services.interfaces;

import java.util.List;

import src.SpringBootBasic.entities.ProductEntity;

public interface IProductService {
  ProductEntity createProduct(ProductEntity product);
  List<ProductEntity> getAllProducts();
}
