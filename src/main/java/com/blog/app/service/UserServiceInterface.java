package com.blog.app.service;

import com.blog.app.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceInterface extends UserDetailsService {
    public UserDto createUser(UserDto user);
}
