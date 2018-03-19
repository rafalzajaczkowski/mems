package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.List;
import java.util.Set;
public interface GifDao{
 List<Gif> findAll();

}
