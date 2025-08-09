package src.SpringBootBasic.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import src.SpringBootBasic.entities.UserEntity;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<UserEntity, Integer> {}

