package io.krispr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        String name = System.getenv("VISITOR_NAME");
        if (name == null) {
            name = "World";
        }
        model.addAttribute("name", name);
        return "index";
    }
}
