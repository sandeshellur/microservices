package com.contact.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public Optional<Contact> getContactsOfUser(Long userId) {
		Optional<Contact> list = contactRepository.findById(userId);
		return list;
	}
}
