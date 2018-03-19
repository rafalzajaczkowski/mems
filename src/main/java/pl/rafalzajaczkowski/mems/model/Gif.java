package pl.rafalzajaczkowski.mems.model;

public class Gif {
    private Long id;
    private String name;
    private Long idCategory;
    private boolean isFavourite;

    public String getGifPath(){
return  "gifs/" +name;
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



    public Gif(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gif(Long id, String name, Long idCategory){
        this(id,name);
        this.idCategory = idCategory;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }
}
