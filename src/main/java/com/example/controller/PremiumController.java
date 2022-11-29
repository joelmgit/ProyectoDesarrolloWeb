package com.example.controller;
import com.example.entity.Premium;
import com.example.service.IPremiumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PremiumController {
    @Autowired
    private IPremiumService premiumService;
    
    @GetMapping("/premium")
    public String index(Model model){
        List<Premium> premiumList = premiumService.getAllPremium();
        model.addAttribute("premiumList", premiumList);
        return"premium";
    }
    @GetMapping("/addpremium")
    public String addPremium(Model model){
        model.addAttribute("premium", new Premium());
        return"addPremium";
    }
    @GetMapping("/editpremium/{id}")
    public String editPremium(@PathVariable("id") Long idPremium, Model model){
        Premium premium = premiumService.getPremiumById(idPremium);
        model.addAttribute("premium", premium);
        return "addPremium";
    }
    @PostMapping("/savepremium")
    public String savePremium(@ModelAttribute Premium premium){
        premiumService.savePremium(premium);
        return "redirect:/";
    }
    @GetMapping("/deletePremium/{id}")
    public String deletePremium(@PathVariable("id") Long idPremium){
        premiumService.delete(idPremium);
        return "redirect:/";
    }
}

