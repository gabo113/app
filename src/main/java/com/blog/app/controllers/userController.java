package com.blog.app.controllers;

import com.blog.app.model.request.UserDetailsRequestModel;
import com.blog.app.model.responses.UserRest;
import com.blog.app.service.UserServiceInterface;
import com.blog.app.service.UserService;
import com.blog.app.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    UserServiceInterface userService;
@GetMapping
public  String getUser() {
    return "Get info user";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

        UserRest userToReturn = new UserRest();

        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createUser = userService.createUser(userDto);

        BeanUtils.copyProperties(createUser, userToReturn);

        return userToReturn;
    }
}
