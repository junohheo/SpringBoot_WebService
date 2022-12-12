package com.example.springboot_webservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class indexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/posts/save")
    public String postSave() {
        return "posts-save";
    }

}
