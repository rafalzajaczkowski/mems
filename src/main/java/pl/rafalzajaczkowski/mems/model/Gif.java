package pl.rafalzajaczkowski.mems.model;

public class Gif {
    private Long id;
    private String name;
     public String getGifPath(){
return  "gifs/" +name+".gif";
     }

    public Gif(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
