package src.SpringBootBasic.services.interfaces;

import java.util.List;

import src.SpringBootBasic.entities.UserEntity;

public interface UserService {
  UserEntity createUser(UserEntity user);
  List<UserEntity> getAllUsers();
}
