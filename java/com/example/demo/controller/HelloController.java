package com.example.demo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam (value = "name",required = false) String name ,
                            @RequestParam(value = "surname",required = false) String surname,
                            Model model){
        model.addAttribute("message","Hello, " + name + " " + surname);

        return "hello-world";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "goodbye";
    }
}
