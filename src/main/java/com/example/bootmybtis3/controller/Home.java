package com.example.bootmybtis3.controller;

import com.example.bootmybtis3.service.StudyService;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class Home {

    @Autowired
    StudyService studyService;

    @GetMapping("")
    public String doHome() {

        return "/home/home";
    }

    @RequestMapping("/home2")
    public String doHome2() {

        return "redirect:/WEB-INF/views/home.html";
    }

    @RequestMapping("/home3")
    public String doHome3() {

        return "redirect:/base/home.html";
    }

    @GetMapping("/study_reg")
    @RequestMapping
    public String doStudy_reg(HttpServletRequest request) {

        List<Map<String, String>> list = new ArrayList<>();
        list = studyService.doStudyList();

        for (Map<String, String> map : list) {
            System.out.println(map.get("key_id"));
            System.out.println(map.get("study_day"));
        }

        // list = addAttribute("list", list);

        return "----";
    }

    @GetMapping("/member_list")
    public String doMember_list() {
        return "/home/member_list";
    }
}
