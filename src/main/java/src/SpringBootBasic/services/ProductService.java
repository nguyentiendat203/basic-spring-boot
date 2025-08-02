package src.SpringBootBasic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.repositories.interfaces.IProductRepository;
import src.SpringBootBasic.services.interfaces.IProductService;

@Service
public class ProductService implements IProductService {
  @Autowired
  private  IProductRepository productRepository;
  
  @Override
  public ProductEntity createProduct(ProductEntity product) {
    return productRepository.createProduct(product);
  }

  @Override
  public List<ProductEntity> getAllProducts() {
    return productRepository.getAllProducts();
  }

}
