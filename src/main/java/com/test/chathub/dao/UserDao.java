package com.test.chathub.dao;

/**
 * @author Atul
 */

import com.test.chathub.dto.User;

public interface UserDao {

	public User saveUserDao(User user);

	public User getUserByEmailDao(String User);

	public User getUserByPhoneDao(long phone);
}
