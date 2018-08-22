package pl.solidsound.ogloszenia;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdRepository {

    private List<Advertisement> ads;

    public AdRepository(List<Advertisement> ads) {
        this.ads = ads;
    }

    public AdRepository() {
        ads = new ArrayList<>();
        ads.add(new Advertisement("Audi A4 2007", "Sprzedam Audi A4 2.0TDI stan igła, bezwypadkowy"));
        ads.add(new Advertisement("Kosiarkę kupię", "Kupię kosiarkę byle tanio"));
        ads.add(new Advertisement("Zamienie Gitarę", "Zamienie gitarę na łóżeczko dziecięce"));

    }

    public void add (Advertisement newAd){
        ads.add(newAd);
    }

    public List<Advertisement> getAds() {
        return ads;
    }

    public Advertisement findByName(String title) {

        for (Advertisement ad : ads) {
            if(ad.getTitle().equals(title)) {
                return ad;
            }
        }

        return null;
    }
}
