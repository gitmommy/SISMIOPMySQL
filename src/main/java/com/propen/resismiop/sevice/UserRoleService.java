package com.propen.resismiop.sevice;

import com.propen.resismiop.model.UserRoleModel;

public interface UserRoleService {
	UserRoleModel addUser(UserRoleModel user);
	public String encrypt(String password);
	void changePassword(UserRoleModel user, String password);
	UserRoleModel findUserByUsername(String username);
	
}
