package src.SpringBootBasic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

  @Value("${player.name}")
  private  String name;

  @Value("${player.name}")
  private  String age;

  @Value("${player.address}")
  private  String address;

  @GetMapping("/v1/api/player/infor")
  public String getInfor() {
    return "Name: " + name + ", Age: " + age + ", Address: " + address;
  }

}
