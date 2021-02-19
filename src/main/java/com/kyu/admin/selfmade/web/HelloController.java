package com.kyu.admin.selfmade.web;

import com.kyu.admin.selfmade.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러는 JSON을 반환하는 컨트롤러로 만들어줌
@RestController
public class HelloController {
    //get요청을 받는 API
    @GetMapping("/test")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping("/test/dto")
    //@RequestParam을 사용하게되면 API에서 넘긴 name이랑 amount 값을 가져와서 String name과 int amount에 넣어주는 과정을 거치게됨
    public HelloResponseDto testDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
