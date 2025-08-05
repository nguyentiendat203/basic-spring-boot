package src.SpringBootBasic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.services.interfaces.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping("/add")
  public ProductEntity createProduct(ProductEntity product) {
    return productService.createProduct(product);
  }

  @GetMapping("/all")
  public List<ProductEntity> getAllProducts() {
    return productService.getAllProducts();
  }
}
