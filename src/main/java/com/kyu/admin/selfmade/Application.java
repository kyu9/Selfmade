package com.kyu.admin.selfmade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//이 Annotation을 통해서 스프링 부트의 자동 설정, 스프링 빈 읽기, 생성을 모두 자동으로 설정
//이 Annotation이 있는 위치부터 설정을 읽어가기 떄문에 무조건 최상단에 존재하고 있어야함
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication에서 WAS을 내장하고 있기 때문에 따로 Tomcat을 실행하지 않아도 잘 실행
        SpringApplication.run(Application.class, args);
    }
}
