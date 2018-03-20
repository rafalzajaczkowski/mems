package pl.rafalzajaczkowski.mems.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.rafalzajaczkowski.mems.repository.CategoryDao;
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

    @GetMapping("/gif")
    public String findCategory(ModelMap map) {
        map.put("category", categoryRepository.findAll());
        return "category";
    }

    private CategoryDao categoryDao = new CategoryDao();

    @GetMapping("/category/{name}")
    public String show(@PathVariable String name){
        return "category";
    }
}