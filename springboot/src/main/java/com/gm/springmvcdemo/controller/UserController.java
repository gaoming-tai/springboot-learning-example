package com.gm.springmvcdemo.controller;

import com.gm.springmvcdemo.domain.User;
import com.gm.springmvcdemo.service.UserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/25
 * @Description TODO
 */
@Api(tags="用户接口")
@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    @ApiOperation(value="查用户信息",notes="根据用户名查用户信息")
    @ApiImplicitParam(name="name",value="用户名",required = true,dataType = "String")
    @RequestMapping(value ="/query", method = {RequestMethod.POST})
    public List<User> queryUsers(@RequestParam String name){
        logger.info("查询用户："+name);
        return  userService.getUserByName(name);
    }

    @ApiOperation(value="查用户信息",notes="根据条件查用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="用户名",required = true,dataType = "String"),
            @ApiImplicitParam(name="sex",value="性别",required = false,dataType = "String"),
            @ApiImplicitParam(name="age",value="年龄",required = false,dataType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    public List<User> queryUsersByConditiaon(@RequestParam String name,@RequestParam String sex,@RequestParam Integer age){
        logger.info("根据条件查用户信息："+name+" "+sex+" "+age);
        return null;
    }

}
