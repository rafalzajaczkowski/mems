package pl.rafalzajaczkowski.mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.rafalzajaczkowski.mems.model.Gif;
import pl.rafalzajaczkowski.mems.repository.GifDao;


@Controller
public class HomeController {
    @Autowired
    public GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }
//@PostMapping("/gif/{name}")
//    public String search(@PathVariable String name, ModelMap modelMap){
//    try {
//        Gif gif = gifDao.findByName();
//        modelMap.put("product",product);
//    } catch (ProductNotFoundException e) {
//        modelMap.put("message","Nie znaleziono produktu");
//    }
//
//}
}


