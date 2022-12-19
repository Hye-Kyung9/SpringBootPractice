package com.example.helloworld.controller;

import com.example.helloworld.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
@RequestMapping("/member")
@RestController
public class MemberController {

    @GetMapping("/test")
    public Member memberTest(){
        return new Member(0L, "HK", 24, "서울", new Date());
    }

    @GetMapping("/test2")
    public ArrayList<Member> memberTest2(){
        return new ArrayList(Arrays.asList(
                new Member(0L, "HK", 24, "서울", new Date()),
                new Member(1L, "JW", 30, "서울", new Date()),
                new Member(2L, "MG", 20, "경기", new Date()),
                new Member(3L, "GY", 24, "인천", new Date()),
                new Member(4L, "KW", 24, "부산", new Date()),
                new Member(5L, "마동석", 10, "충주", new Date())
        ));
    }
}
