package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class CategoryDao implements CategoryRepository {

    private static List<Category> categories = new ArrayList<>();


    static {
        categories.add(new Category(1,"Android"));
        categories.add(new Category(2,"Funny"));
        categories.add(new Category(3, "Programming"));
    }


    public CategoryDao(){}


    @Override
    public List<Category> findAll(){
        return categories;
    }


    public Category findByCategory(String name) {
        return categories.stream().filter(c->c.getName().equals( name)).collect(Collectors.toList()).get(0);
    }

}
