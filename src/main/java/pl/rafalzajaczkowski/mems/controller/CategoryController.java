package pl.rafalzajaczkowski.mems.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.repository.CategoryDao;
import pl.rafalzajaczkowski.mems.repository.CategoryRepository;
import pl.rafalzajaczkowski.mems.repository.GifDao;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    public GifDao gifDao;


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
    public String gif(@PathVariable String name, ModelMap modelMap) {
        Category category = categoryRepository.findByCategory(name);
        modelMap.addAttribute("category",category);
        modelMap.addAttribute("gifs", gifDao.findByCategory((long)category.getId()));
        return "category";
    }
}


