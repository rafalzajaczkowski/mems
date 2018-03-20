package pl.rafalzajaczkowski.mems.repository;


import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll();
    Category findByName(String name);
}
