package pl.rafalzajaczkowski.mems.repository;

import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;
import java.util.List;

public interface GifDao {

 List<Gif> findAll();

 String findUserNameByGifName(String memName);

 Gif findByName(String name);

 List<Gif> find(String memName);
 List<Gif> findByCategory(Long id);

}

