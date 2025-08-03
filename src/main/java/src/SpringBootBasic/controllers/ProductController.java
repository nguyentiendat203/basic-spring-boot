package src.SpringBootBasic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.services.interfaces.ProductService;

import java.util.List;


@RestController
@RequestMapping("/v1/api")
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping("/product")
  public ProductEntity createProduct(ProductEntity product) {
    return productService.createProduct(product);
  }

  @GetMapping("/products")
  public List<ProductEntity> getAllProducts() {
    return productService.getAllProducts();
  }
}
