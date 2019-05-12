package com.example.demo.Controller;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("login")
    public int login(String userName, String password) {
        User user = userDao.getUserByName(userName);
        return user.getPassword().equals(password) ? user.getId() : -1;
    }

    @RequestMapping("{id}")
    public User getUser(@PathVariable("id") int id) {
        return userDao.getUserById(id);
    }

}
