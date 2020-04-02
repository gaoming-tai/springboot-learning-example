package com.gm.springmvcdemo.dao;

import com.gm.springmvcdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gaoming on 2020/3/31.
 */
@Mapper
public interface UserMapper {

    //查用户名
    List<User> getUserByName(String name);
}




