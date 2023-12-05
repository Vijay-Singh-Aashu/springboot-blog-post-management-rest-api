package com.excellence_springboot_blog_post_management.service;

import com.excellence_springboot_blog_post_management.payload.LoginDto;
import com.excellence_springboot_blog_post_management.payload.RegisterDto;

public interface AuthService {
	String login(LoginDto loginDto);

	String register(RegisterDto registerDto);
}
