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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
