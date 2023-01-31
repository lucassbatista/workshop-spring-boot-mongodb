package com.lucasbatista.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasbatista.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User,String>{

}
