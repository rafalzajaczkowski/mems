package pl.rafalzajaczkowski.mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.rafalzajaczkowski.mems.repository.GifDao;


@Controller
public class HomeController {
    @Autowired
public GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("gifs",gifDao.findAll());
        return "home";
    }
}
