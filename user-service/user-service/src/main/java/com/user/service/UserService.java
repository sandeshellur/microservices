package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User getUser(Long id) {
		Optional<User> list = userRepository.findById(id);
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
