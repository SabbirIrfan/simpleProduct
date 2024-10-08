package com.dsi.project.repository;

import com.dsi.project.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

     User findByEmail(String email);

}

