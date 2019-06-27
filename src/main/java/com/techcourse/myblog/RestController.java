package com.techcourse.myblog;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping(value="/test")
    public String status(){
        return "hello! RestController test!";
    }
}
