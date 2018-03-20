package pl.rafalzajaczkowski.mems.repository;


import pl.rafalzajaczkowski.mems.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll();
    Category findById(Long id);
}
