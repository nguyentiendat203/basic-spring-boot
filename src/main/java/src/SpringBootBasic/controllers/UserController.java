package src.SpringBootBasic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import src.SpringBootBasic.entities.UserEntity;
import src.SpringBootBasic.services.interfaces.UserService;

@Controller 
@RequestMapping("/user") 
public class UserController {
  @Autowired 
  private UserService userService;

  @PostMapping("/add") 
  public @ResponseBody UserEntity addNewUser (@RequestParam String name, @RequestParam String email) {
    UserEntity n = new UserEntity();
    n.setName(name);
    n.setEmail(email);
    return userService.createUser(n);
  }

  @GetMapping("/all")
  public @ResponseBody List<UserEntity> getAllUsers() {
    return userService.getAllUsers();
  }
}
