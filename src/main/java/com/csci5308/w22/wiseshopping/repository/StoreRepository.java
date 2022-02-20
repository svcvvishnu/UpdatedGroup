package com.csci5308.w22.wiseshopping.repository;

import com.csci5308.w22.wiseshopping.models.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Elizabeth James
 */
@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {
}
