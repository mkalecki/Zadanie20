package pl.solidsound.ogloszenia;

public class Advertisement {
    private String title;
    private String description;
//    private AdType type;

    public Advertisement(){
    }

    public Advertisement(String title, String description/*, AdType type*/) {
        this.title = title;
        this.description = description;
//        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

//    public AdType getType() {
//        return type;
//    }
}



