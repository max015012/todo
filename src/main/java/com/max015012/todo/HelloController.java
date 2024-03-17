package com.max015012.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "hello");
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        return "index";
    }
}