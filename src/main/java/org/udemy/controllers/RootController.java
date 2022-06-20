package org.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping
    public String indexPage(){
        return "/index";
    }
}
