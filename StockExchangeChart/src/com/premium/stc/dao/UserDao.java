package com.premium.stc.dao;

import com.premium.stc.model.Login;
import com.premium.stc.model.UpdateUser;
import com.premium.stc.model.User;

public interface UserDao {

	public User loginUser(Login login);
	public boolean registerUser(User user);
	public boolean updateUser(UpdateUser user);
	
}
