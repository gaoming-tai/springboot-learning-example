package com.gm.springmvcdemo.service.impl;/**
 * Created by gaoming on 2020/3/31.
 */

import com.gm.springmvcdemo.dao.UserMapper;
import com.gm.springmvcdemo.domain.User;
import com.gm.springmvcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/31
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
