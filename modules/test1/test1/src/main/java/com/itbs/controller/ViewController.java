package com.itbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/FAruku")
    public String getRuku() {
        return "ruku";
    }

    @RequestMapping("/recyclebao")
    public String getRecycle() {
        return "recyleBao";
    }
}
