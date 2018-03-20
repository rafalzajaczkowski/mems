package pl.rafalzajaczkowski.mems.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Category;
import pl.rafalzajaczkowski.mems.model.Gif;
import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImp implements GifDao {

    private static List<Gif> gifs = new ArrayList<>();

    @Autowired
    private CategoryRepository categoryDao;

    // this block is created before class
    static {
        gifs.add(new Gif(1L, "android-explosion.gif", 1L));
        gifs.add(new Gif(2L, "ben-and-mike.gif", 1L));
        gifs.add(new Gif(3L, "book-dominos.gif", 2L));
        gifs.add(new Gif(4L, "compiler-bot.gif", 2L));
        gifs.add(new Gif(5L, "cowboy-coder.gif", 3L));
        gifs.add(new Gif(6L, "infinite-andrew.gif", 3L));
    }

    @Override
    public String findUserNameByGifName(String memName) {
        for (Gif g : gifs) {
            if (g.getName().equals(memName)) {
                return g.getUserName();
            }
        }
        return "null";
    }

    @Override
    public Gif findByName(String name) {
        return gifs.stream().filter(gif -> gif.getName()
                .equals(name)).
                findFirst().get();
    }

    @Override
    public List<Gif> findByCategoryName(String name) {
        for (Gif gif : gifs) {
            if (gif.getName().equals(name)) {
                gifs.add(gif);
            }
            return null;
        }
        return null;
    }
}

