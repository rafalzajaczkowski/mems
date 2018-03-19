package pl.rafalzajaczkowski.mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalzajaczkowski.mems.repository.CategoryRepository;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String findAll(ModelMap map) {
        map.put("categories", categoryRepository.findAll());
        return "categories";
    }

}
