package src.SpringBootBasic.services.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import src.SpringBootBasic.dto.request.ProductDTO;
import src.SpringBootBasic.entities.ProductEntity;

public interface ProductService {
  ProductEntity createProduct(ProductEntity product);
  Page<ProductEntity> getAllProducts(Pageable pageable);
  List<ProductEntity> findByNameContaining(String name);
  ProductEntity updateProduct(Long id,ProductDTO product);
  void deleteProduct(Long id); 
}
