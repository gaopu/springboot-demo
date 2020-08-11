package cn.geekgao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(value = "get")
    public String hello() {
        return "Hello Spring Boot!!!";
    }
}
