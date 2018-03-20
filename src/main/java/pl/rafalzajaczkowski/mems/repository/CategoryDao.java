package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDao implements CategoryRepository {

    public CategoryDao(){}
    private static List<Category> categories  = new ArrayList<>();

    static {
        categories.add(new Category(1,"Android"));
        categories.add(new Category(2,"Funny"));
        categories.add(new Category(3, "Programming"));
    }


    @Override
    public List<Category> findAll(){
        return categories;
    }

    @Override
    public Category findByName(String name) {
        for ( Category category: categories){
            if ( category.getName().equals(name)){
                return category;
            }
        }
        return null;
    }
}
