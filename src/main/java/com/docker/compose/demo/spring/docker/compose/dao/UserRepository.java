package com.docker.compose.demo.spring.docker.compose.dao;

import com.docker.compose.demo.spring.docker.compose.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}