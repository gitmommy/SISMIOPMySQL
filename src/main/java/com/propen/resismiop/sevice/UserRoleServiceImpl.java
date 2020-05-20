package com.propen.resismiop.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.propen.resismiop.model.UserRoleModel;
import com.propen.resismiop.repository.UserDb;
import com.propen.resismiop.sevice.UserRoleService;

@Service
	public class UserRoleServiceImpl implements UserRoleService {
		@Autowired
		private UserDb userDb;

		@Override
		public UserRoleModel addUser(UserRoleModel user) {
			String pass = encrypt(user.getPassword());
			user.setPassword(pass);
			return userDb.save(user);
		}

		@Override
		public String encrypt(String password) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);
			return hashedPassword;
		}

		@Override
		public UserRoleModel findUserByUsername(String username) {
			return userDb.findByUsername(username);
		}

		@Override
		public void changePassword(UserRoleModel user, String password) {
			String pass = encrypt(password);
			user.setPassword(pass);
			userDb.save(user);
		}
	}

