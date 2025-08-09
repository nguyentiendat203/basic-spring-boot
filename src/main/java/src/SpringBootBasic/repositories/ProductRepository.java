package src.SpringBootBasic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import src.SpringBootBasic.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>  {
  List<ProductEntity> findByNameContaining(String keyword);
}
