package com.belalangtempur.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arif on 7-7-16.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "das boot, reporting for duty";
    }
}
