package com.shuba.connection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ReceiverController {

    @GetMapping("/ch")
    public String connectToIp() {
        return "connect success";
    }
}
