package pl.rafalzajaczkowski.mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @GetMapping("/gif/{name}")
    public String gif(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("gif",gifDao.findByName(name));
        return "gif-details";
   }
//    @GetMapping("/gif")
//    public String hrrome(){
//        return "gif";
//    }
    @GetMapping("/home/search")
    public String search(@RequestParam String name, ModelMap modelMap){
        if (gifDao.find(name).size()==0)
            modelMap.addAttribute("message","Nie ma takiego gifa");
        else
        modelMap.addAttribute("gifs",gifDao.find(name));
        return "home";
    }
}


