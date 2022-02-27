package com.csci5308.w22.wiseshopping.repository;

import com.csci5308.w22.wiseshopping.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pavithra Gunasekaran
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
   User findByEmailAndPassword(String email, String password);

}
