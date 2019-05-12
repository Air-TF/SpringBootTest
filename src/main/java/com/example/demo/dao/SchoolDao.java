package com.example.demo.dao;

import com.example.demo.domain.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {
    List<School> listSchool();

    School getSchool(int id);
}
