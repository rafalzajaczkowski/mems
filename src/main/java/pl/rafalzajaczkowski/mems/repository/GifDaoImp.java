package pl.rafalzajaczkowski.mems.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.rafalzajaczkowski.mems.model.Gif;
import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImp implements GifDao {

    private static List<Gif> gifs = new ArrayList<>();

    // this block is created before class
    static {
        gifs.add(new Gif(1L, "android-explosion.gif","Adiczek"));
        gifs.add(new Gif(2L, "ben-and-mike.gif","Dark Lord"));
        gifs.add(new Gif(3L, "book-dominos.gif","Darth Vader"));
        gifs.add(new Gif(4L, "compiler-bot.gif","Minionki"));
        gifs.add(new Gif(5L, "cowboy-coder.gif","Kamil"));
        gifs.add(new Gif(6L, "infinite-andrew.gif","Marcin_12"));
    }

    @Override
    public String findUserNameByGifName (String memName) {
        for (Gif g:gifs) {
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


    public List<Gif> find(String memName) {
        List<Gif> list = new ArrayList<>();
        for (Gif g : gifs) {
            if (g.getName().contains(memName)) {
                list.add(g);
            }
        }
        return list ;
    }

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