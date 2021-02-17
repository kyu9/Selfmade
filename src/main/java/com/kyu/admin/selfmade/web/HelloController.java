package com.kyu.admin.selfmade.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러는 JSON을 반환하는 컨트롤러로 만들어줌
@RestController
public class HelloController {
    //get요청을 받는 API
    @GetMapping("/test")
    public String hello(){
        return "Hello World!!";
    }
}
