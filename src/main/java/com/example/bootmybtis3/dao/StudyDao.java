package com.example.bootmybtis3.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudyDao {

    // 공부기록 전체 리스트
    public List<Map<String, String>> doStudyList();

    // 공부기록 One row

    // 공부기록 수정

    // 공부기록 삭제
    public int doStudyDel(String strKeyId);

    // 공부하기 등록

}
