package pl.rafalzajaczkowski.mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
public class GifDao ;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("gifs",gifDa)
        return "home";
    }
}
