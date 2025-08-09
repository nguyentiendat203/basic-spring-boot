package src.SpringBootBasic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.SpringBootBasic.entities.UserEntity;
import src.SpringBootBasic.repositories.UserRepository;
import src.SpringBootBasic.services.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService  {
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity createUser(UserEntity user) {
    return userRepository.save(user);
  }

  @Override
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }

}
