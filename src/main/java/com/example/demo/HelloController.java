package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloService helloService = new HelloService();
    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloService.answerHello(userName);
    }
}
