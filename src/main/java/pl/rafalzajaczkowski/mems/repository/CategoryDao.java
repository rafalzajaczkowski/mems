package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDao implements CategoryRepository {

    public CategoryDao(){}
    private static List<Gif> categories  = new ArrayList<>();

    @Override
    public List<Category> findAll(){
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"Android"));
        categories.add(new Category(2,"Funny"));
        categories.add(new Category(3, "Programming"));
        return categories;
    }

 }
