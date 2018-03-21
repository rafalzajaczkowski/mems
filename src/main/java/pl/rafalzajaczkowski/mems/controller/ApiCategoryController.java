package pl.rafalzajaczkowski.mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.repository.CategoryRepository;

@RequestMapping("/api")
@ResponseBody
public class ApiCategoryController {

    @Autowired
    CategoryRepository categoryRepository;

//    @GetMapping("/categories/{id}")
//    public Category getCategories(@PathVariable int id){
//        Category category= categoryRepository.findById(id);
//    }
}
