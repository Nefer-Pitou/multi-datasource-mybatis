package com.liyingyu.multidatasource.controller;

import com.liyingyu.multidatasource.dao.one.UserOneDao;
import com.liyingyu.multidatasource.dao.two.UserTwoDao;
import com.liyingyu.multidatasource.entity.one.UserOne;
import com.liyingyu.multidatasource.entity.two.UserTwo;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yingyu Li
 * @create 2018-07-13 18:22
 **/

@RestController
public class UserController {

    private final UserOneDao userOneDao;

    private final UserTwoDao userTwoDao;

    @Autowired
    public UserController(UserOneDao userOneDao, UserTwoDao userTwoDao) {
        this.userOneDao = userOneDao;
        this.userTwoDao = userTwoDao;
    }

    @GetMapping("/users_1")
    public List<UserOne> getUsersOne() {
        return userOneDao.getUsers();
    }

    @GetMapping("/users_2")
    public List<UserTwo> getUsersTwo() {
        return userTwoDao.getUsers();
    }

    @PostMapping("/user/{id}")
    public UserOne updateUser(@PathVariable("id") int id, @RequestParam("name") String name) {
        userOneDao.updateUser(id, name);
        return userOneDao.getUserById(id);
    }

}
