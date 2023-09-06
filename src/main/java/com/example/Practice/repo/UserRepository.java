package com.example.Practice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Practice.entity.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {

}
