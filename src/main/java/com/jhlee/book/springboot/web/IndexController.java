package com.jhlee.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //머스테치 스타터로 인해 문자열 반환시 prefix와 suffix가 자동 지정 (src/main..), (.mustache)
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
