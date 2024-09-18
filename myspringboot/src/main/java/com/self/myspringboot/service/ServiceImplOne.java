package com.self.myspringboot.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceImplOne implements Service{

    public String showData() {
        return "return showData from ServiceImplOne, impl service";
    }

}