package com.test.chathub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.chathub.dto.User;

/**
 * @author Atul
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

	public User findByPhone(long phone);
}
