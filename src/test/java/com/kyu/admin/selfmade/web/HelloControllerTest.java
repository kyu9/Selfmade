package com.kyu.admin.selfmade.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//테스트를 진행할 때 JUnit에 내장된 실행자 말고 SpringRunner라는 스프링 실행자를 사용
//springboottest와 JUnit사이의 연결자 역할 수행
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    //웹 API를 테스트할 떄 사용, 스프링 MVC 테스트의 시작
    @Autowired
    private MockMvc mvc;

    @Test
    public void firTest() throws Exception {
        //controller에서 /test으로 get요청을 보내면 "Hello World!!"라는 문자열을 리턴하도록함
        String test = "Hello World!!";

        //MockMvc를 통해서 " "내부의 주소로 http get요청을 함 + throws Exception을 추가해줘야함
        mvc.perform(get("/test"))
                //정상적으로 진행되었을때(http코드 200)
                .andExpect(status().isOk())
                //Controller에서 Hello World을 리턴하기 떄문에 맞는지 확인
                .andExpect(content().string(test));
    }
}
