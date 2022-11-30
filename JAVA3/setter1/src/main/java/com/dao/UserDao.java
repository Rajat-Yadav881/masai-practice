package com.dao;

import com.exception.UserNotFoundException;
import com.model.User;

import java.util.List;

public interface UserDao {

    public User createUser(User user)throws UserNotFoundException;
    public List<User> findName(String name) throws UserNotFoundException;

}
