package com.lucasbatista.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasbatista.workshopmongo.domain.User;
import com.lucasbatista.workshopmongo.repository.UserRepository;
import com.lucasbatista.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String Id) {
		Optional<User> obj = userRepository.findById(Id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
	}
}
