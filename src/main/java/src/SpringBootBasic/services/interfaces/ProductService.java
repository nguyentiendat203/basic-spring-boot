package src.SpringBootBasic.services.interfaces;

import java.util.List;

import src.SpringBootBasic.dto.request.ProductDTO;
import src.SpringBootBasic.entities.ProductEntity;

public interface ProductService {
  ProductEntity createProduct(ProductEntity product);
  List<ProductEntity> getAllProducts();
  List<ProductEntity> findByNameContaining(String name);
  ProductEntity updateProduct(Long id,ProductDTO product);
  void deleteProduct(Long id); 
}
