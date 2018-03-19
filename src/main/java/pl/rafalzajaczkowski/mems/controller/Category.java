package pl.rafalzajaczkowski.mems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Category {
    @GetMapping("/category")
    public String category(){
        return "category";
    }
}
