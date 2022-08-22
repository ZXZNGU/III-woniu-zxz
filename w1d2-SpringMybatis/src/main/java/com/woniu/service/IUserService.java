package com.woniu.service;

import com.github.pagehelper.PageInfo;
import com.woniu.entity.User;

public interface IUserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUserById(Integer id);

    public User getUserById(Integer id);

    public PageInfo<User> findAllUsers();
}
