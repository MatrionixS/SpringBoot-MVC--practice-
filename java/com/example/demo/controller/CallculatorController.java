package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first/calculator")
public class CallculatorController {

    @GetMapping
    public String calculator(@RequestParam(value = "a",required = false) Integer intA,
                             @RequestParam(value = "b",required = false) Integer intB,
                             @RequestParam(value = "action",required = false) String action,
                             Model model){
        int result= 0;
        switch (action){
            case "multiplication":
                 result = intA * intB;
                break;
            case "addition":
                 result = intA + intB;
                break;
            case "subtraction":
                result = intA - intB;
                break;
            case "division":
                result = intA / intB;
                break;
        }
        model.addAttribute("result", intA +" "+ action+ " "+intB+" "+" = " +result);
        return "calculator";
    }
}
