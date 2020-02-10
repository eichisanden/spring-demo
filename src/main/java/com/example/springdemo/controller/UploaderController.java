package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("uploader")
public class UploaderController {
    @GetMapping
    public String index() {
        return "uploader";
    }

    @PostMapping
    public String upload() {
        return "uploader";
    }
}
