package com.self.myspringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestContoller {

    @GetMapping("/start")
    public String start() {
        return "return from spring boot on aws , update by checkin";
    }

}