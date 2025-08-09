package src.SpringBootBasic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.SpringBootBasic.dto.request.ProductDTO;
import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.repositories.interfaces.ProductRepository;
import src.SpringBootBasic.services.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public ProductEntity createProduct(ProductEntity product) {
    return productRepository.save(product);
  }

  @Override
  public List<ProductEntity> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public List<ProductEntity> findByNameContaining(String name) {
    return productRepository.findByNameContaining(name);
  }

  @Override
  public ProductEntity updateProduct(Long id,ProductDTO body) {
    ProductEntity product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
      
    body.getId().ifPresent(product::setId);
    body.getName().ifPresent(product::setName);
    body.getPrice().ifPresent(product::setPrice);
    return productRepository.save(product);
  }

  @Override
  public void deleteProduct(Long id) {
    ProductEntity product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    productRepository.delete(product);
  }
}
