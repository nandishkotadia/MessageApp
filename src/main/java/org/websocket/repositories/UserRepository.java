package org.websocket.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.websocket.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

   User findByUsernameAndPassword(String username, String password);
  
   @Query("SELECT u FROM User u WHERE username != :username")
   List<User> findByNotUsername(@Param(value = "username") String username);
   
   User findByUsername(String username);
}
