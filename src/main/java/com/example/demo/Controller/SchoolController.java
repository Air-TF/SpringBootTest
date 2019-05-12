package com.example.demo.Controller;

import com.example.demo.dao.SchoolDao;
import com.example.demo.domain.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("school")
@RestController
public class SchoolController {

    @Autowired
    SchoolDao schoolDao;

    @RequestMapping("")
    public List<School> listSchool() {
        return schoolDao.listSchool();
    }

    @RequestMapping("{id}")
    public School getSchool(@PathVariable("id")int id){
        return schoolDao.getSchool(id);
    }
}
