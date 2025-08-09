package src.SpringBootBasic.dto.request;

import java.util.Optional;

import lombok.Data;

@Data
public class ProductDTO {
  private Optional<Integer> id;
  private Optional<String> name;
  private Optional<Double> price;
}
