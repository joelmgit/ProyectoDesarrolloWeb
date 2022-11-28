package com.example.controller;
import com.example.entity.Suscripcion;
import com.example.service.ISuscripcionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SuscripcionController {
    @Autowired
    private ISuscripcionService suscripcionService;
    
    @GetMapping("/suscripcion")
    public String index(Model model){
        List<Suscripcion> suscripcionList = suscripcionService.getAllSuscripcion();
        model.addAttribute("suscripcionList", suscripcionList);
        return"suscripcion";
    }
    @GetMapping("/addsuscripcion")
    public String addSuscripcion(Model model){
        model.addAttribute("suscripcion", new Suscripcion());
        return"addSuscripcion";
    }
    @GetMapping("/editsuscripcion/{id}")
    public String editSuscripcion(@PathVariable("id") Long idSuscripcion, Model model){
        Suscripcion suscripcion = suscripcionService.getSuscripcionById(idSuscripcion);
        model.addAttribute("suscripcion", suscripcion);
        return"addSuscripcion";
    }
    @PostMapping("/savesuscripcion")
    public String saveSuscripcion(@ModelAttribute Suscripcion suscripcion){
        suscripcionService.saveSuscripcion(suscripcion);
        return"redirect:/";
    }
    @GetMapping("/deletesuscripcion/{id}")
    public String deleteSuscripcion(@PathVariable("id") Long idSuscripcion){
        suscripcionService.delete(idSuscripcion);
        return"redirect:/";
    }
}