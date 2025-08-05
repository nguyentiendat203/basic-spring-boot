package src.SpringBootBasic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
