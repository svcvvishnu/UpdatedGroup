package com.csci5308.w22.wiseshopping.repository;

import com.csci5308.w22.wiseshopping.models.Merchant;
import com.csci5308.w22.wiseshopping.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pavithra Gunasekaran
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    Boolean findByEmail(String email);
}
