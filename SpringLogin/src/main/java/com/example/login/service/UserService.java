package com.example.login.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.login.entity.User;

public interface UserService {

	User register(User user);
	 
    User findByEmail(String email);
 
    void updateResetPasswordToken(String token, String email) throws UsernameNotFoundException;
 
    User getByResetPasswordToken(String token);
 
    void updatePassword(User user, String newPassword);
}
