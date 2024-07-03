package com.example.bootmybtis3.service;

import com.example.bootmybtis3.dao.StudyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudyService {

    @Autowired
    StudyDao studyDao;

    public List<Map<String, String>> doStudyList() {

        List<Map<String, String>> list = new ArrayList<>();
        list = studyDao.doStudyList();
        return list;
    }
}
