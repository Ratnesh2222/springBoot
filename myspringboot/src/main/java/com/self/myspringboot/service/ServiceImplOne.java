package com.self.myspringboot.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceImplOne implements Service{

    public String showData() {
        return "20sep showData from ServiceImplOne, impl service";
    }

}