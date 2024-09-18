package com.self.myspringboot.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceImplTwo implements Service{

    public String showData() {
        return "return showData from ServiceImplTwo, impl service";
    }

}