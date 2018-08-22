package pl.solidsound.ogloszenia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    private AdRepository adRepository;

    public HomeController(AdRepository adRepository){
        this.adRepository = adRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        List<Advertisement> ads = adRepository.getAds();

        model.addAttribute("allAds",ads);
        model.addAttribute("newAd", new Advertisement());
        return "index";
    }

    @GetMapping("/ogloszenie")
        public String ad (Model model, @RequestParam String tytul){
        Advertisement findedAd = adRepository.findByName(tytul);
        model.addAttribute("adv", findedAd);
        return "adview";
    }

    @PostMapping("/addAd")
    public String addAdd (Advertisement advertisement){
        adRepository.add(advertisement);
        return "redirect:/";
    }



}
