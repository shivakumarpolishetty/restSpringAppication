package com.Spingdemo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("/home")
    public String greetting()
    {
        return "welcome to the springapplication ";
    }


}
