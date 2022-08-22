package com.woniu.controller;

import com.github.pagehelper.PageInfo;
import com.woniu.entity.User;
import com.woniu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;


    public PageInfo<User> findUserList() {
        return userService.findAllUsers();
    }


    public void addUser(User user) {
        userService.addUser(user);
    }

    public void udpateUser(User user) {
        userService.updateUser(user);
    }
}
