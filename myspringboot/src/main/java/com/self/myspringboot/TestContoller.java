package com.self.myspringboot;

import com.self.myspringboot.service.Service;
import com.self.myspringboot.service.ServiceImplOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestContoller {
    Logger logger =  LoggerFactory.getLogger(TestContoller.class);

    @Autowired
    Service service;

    @GetMapping("/start")
    public String start() {
        logger.info("---inside TestContoller.start---");
        return service.showData();
    }

}