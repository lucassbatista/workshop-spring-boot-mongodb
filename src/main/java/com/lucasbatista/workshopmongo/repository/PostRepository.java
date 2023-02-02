package com.lucasbatista.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasbatista.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}