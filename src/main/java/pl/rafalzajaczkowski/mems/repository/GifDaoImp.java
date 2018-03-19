package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.ArrayList;
import java.util.List;
@Component
public class GifDaoImp implements GifDao {
    @Override
    public List<Gif> findAll(){
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif(1L,"android-explosion.gif",1L));
        gifs.add(new Gif(2L,"ben-and-mike.gif",1L));
        gifs.add(new Gif(3L,"book-dominos.gif",2L));
        gifs.add(new Gif(4L,"compiler-bot.gif",2L));
        gifs.add(new Gif(5L,"cowboy-coder.gif",3L));
        gifs.add(new Gif(6L,"infinite-andrew.gif",3L));
        return gifs;
    }


}
