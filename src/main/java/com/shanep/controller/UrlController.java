package com.shanep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

    @GetMapping("/")
    public String home() {
        return "index"; // index.html 템플릿 반환
    }
}