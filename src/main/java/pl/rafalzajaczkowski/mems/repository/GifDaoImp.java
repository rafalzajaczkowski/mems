package pl.rafalzajaczkowski.mems.repository;

import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Gif;

import java.util.ArrayList;
import java.util.List;
@Component
public class GifDaoImp implements GifDao {
    @Override
    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif(1L, "android-explosion.gif"));
        gifs.add(new Gif(2L, "ben-and-mike.gif"));
        gifs.add(new Gif(3L, "book-dominos.gif"));
        gifs.add(new Gif(4L, "compiler-bot.gif"));
        gifs.add(new Gif(5L, "cowboy-coder.gif"));
        gifs.add(new Gif(6L, "infinite-andrew.gif"));
        return gifs;
    }

    private static List<Gif> gifs = new ArrayList<>();

    @Override
    public String findByName(String name) {
        for (Gif g : gifs) {
            if (g.getName().equals(name)) {
                return g.getName();
            }

        }
        return null;
    }
}