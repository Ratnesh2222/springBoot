package com.self.myspringboot.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class ServiceImplOne {

    public String showData() {
        return "return showData from ServiceImplOne";
    }

}