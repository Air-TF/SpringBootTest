package com.example.demo.Controller;

import com.example.demo.dao.TalkDao;
import com.example.demo.domain.Talk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RequestMapping("talk")
@RestController
public class TalkController {

    @Autowired
    TalkDao talkDao;

    @RequestMapping("")
    public List<Talk> listTalk() {
        return talkDao.listTalk();
    }

    @RequestMapping(value = "publish")
    public Boolean publish(int userId, Talk talk) {
        talk.setTime(new Date());
        return talkDao.addTalk(userId, talk) == 1;
    }

    @RequestMapping("search")
    public List<Talk> getSearchList(String keyword){
        return talkDao.getSearch(keyword);
    }

    @RequestMapping("{id}")
    public Talk getTalk(@PathVariable("id")int id){
        return talkDao.getTalk(id);
    }
}