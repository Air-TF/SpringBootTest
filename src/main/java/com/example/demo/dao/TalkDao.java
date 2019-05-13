package com.example.demo.dao;

import com.example.demo.domain.Talk;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface TalkDao {
    List<Talk> listTalk();

    int addTalk(@Param("userId") int userId, Talk talk);

    List<Talk> getSearch(@Param("keyword") String keyword);

    Talk getTalk(@Param("id")int id);
}
