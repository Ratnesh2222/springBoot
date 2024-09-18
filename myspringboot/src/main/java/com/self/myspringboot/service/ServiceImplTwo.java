package com.self.myspringboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ServiceImplTwo implements Service{

    public String showData() {
        return "return showData from ServiceImplTwo, impl service";
    }

}