package com.isigroupe.ms2.web.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {


    @GetMapping("/ms2")
    public String getHome(){
        return "Hello World ms2";
    }

}
