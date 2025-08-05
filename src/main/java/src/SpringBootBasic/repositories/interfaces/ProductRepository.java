package src.SpringBootBasic.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import src.SpringBootBasic.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>  {}
