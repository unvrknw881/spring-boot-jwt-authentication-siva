package com.siva.repository;
import org.springframework.data.repository.CrudRepository;

import com.siva.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}