package src.SpringBootBasic.entities;

import lombok.Data;

@Data
public class ProductEntity {
  private Long id;
  private String name;
  private Double price;

  // If we dont use @Data, we can manually implement the getters and setters
  // Getters and Setters
}
