package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.List;
import java.util.Set;
@Component
public interface GifDao{
 List<Gif> findAll();

}
