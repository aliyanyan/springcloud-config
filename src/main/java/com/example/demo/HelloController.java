package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "order/query")
    public String query() {
        String a = "travis 构建成功  ";
        System.out.println(a);
        return a;
    }
}
