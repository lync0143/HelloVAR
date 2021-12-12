package io.krispr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Greet visitors.
 */

@Controller
public class HelloController {
    /**
     * Greet visitors on the main page.
     *
     * @param model model for the view
     * @return name of the template file to use for the response
     */
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
