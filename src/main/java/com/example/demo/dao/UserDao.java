package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserByName(@Param("userName")String userName);

    User getUserById(int id);
}
