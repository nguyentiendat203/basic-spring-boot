package src.SpringBootBasic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import src.SpringBootBasic.dto.request.ProductDTO;
import src.SpringBootBasic.entities.ProductEntity;
import src.SpringBootBasic.services.interfaces.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping("/add")
  public ProductEntity createProduct(@RequestBody ProductEntity product) {
    return productService.createProduct(product);
  }

  @GetMapping("/all")
  public Page<ProductEntity> getAllProducts(
    @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size,
    @RequestParam(defaultValue = "id") String sortBy,
    @RequestParam(defaultValue = "true") boolean ascending
  ) {
    Sort sort = ascending ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
    Pageable pageable = PageRequest.of(page, size, sort);
    return productService.getAllProducts(pageable);
  }

  @GetMapping("")
  public List<ProductEntity> getProduct(@RequestParam String name) {
    return productService.findByNameContaining(name);
  }

  @PutMapping("update/{id}")
  public ProductEntity putMethodName(@PathVariable("id") Long id, 
                    @RequestBody ProductDTO product) {
      return productService.updateProduct(id, product);
  }

  @DeleteMapping("/delete/{id}")
  public void deleteProduct(@PathVariable("id") Long id) {
   productService.deleteProduct(id);
  }
}
