package com.kyu.admin.selfmade.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인_페이지_로딩(){
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).contains("아직 주제는 없는 웹 페이지");
    }
}
