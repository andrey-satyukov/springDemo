package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloService {
    @GetMapping
    public String hello() {
        return "<b>hello</b>";
    }

    public String answerHello(String userName) {
        return "<b>hello friend</b>" + userName;
    }
}
