package com.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String display() {
        return "index";
    }

    @RequestMapping("/hello")
    public String display(Model model) {
        model.addAttribute("message", "Hello everyOne ");
        return "hello";
    }
}
