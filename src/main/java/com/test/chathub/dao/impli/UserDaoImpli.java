package com.test.chathub.dao.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.chathub.dao.UserDao;
import com.test.chathub.dto.User;
import com.test.chathub.repository.UserRepository;

/**
 * @author Atul
 */
@Repository
public class UserDaoImpli implements UserDao {

	@Autowired
	private UserRepository repository;

	@Override
	public User saveUserDao(User user) {
		return repository.save(user);
	}

	@Override
	public User getUserByEmailDao(String userEmail) {
		return repository.findByEmail(userEmail);
	}

	@Override
	public User getUserByPhoneDao(long userPhone) {
		return repository.findByPhone(userPhone);
	}

}
