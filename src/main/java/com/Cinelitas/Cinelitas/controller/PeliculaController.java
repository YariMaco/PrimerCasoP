/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.controller;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.entity.Sala;
import com.Cinelitas.Cinelitas.service.IPeliculaService;
import com.Cinelitas.Cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author menoc
 */
@Controller
public class PeliculaController {

    @Autowired
    private ISalaService salaService;

    @Autowired

    private IPeliculaService peliculaService;

    @GetMapping("/pelicula")
    public String historial(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPeli();
        model.addAttribute("titulo", "Lista Películas");
        model.addAttribute("pelicula", listaPelicula);
        return "peliculas";

    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/peliculas";        

    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Sala> listaSala = salaService.listSala();
        model.addAttribute("pelicula",new Pelicula());
        model.addAttribute("salas",listaSala);
        return "crear";
    }
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";        
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSala = salaService.listSala();
        model.addAttribute("pleicula", pelicula);
        model.addAttribute("salas", listaSala);
        return "crear";

    }
    
    
    
    

}
