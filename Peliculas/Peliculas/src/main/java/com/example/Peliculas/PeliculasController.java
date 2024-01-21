package com.example.Peliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(PeliculasController.PELICULAS)
public class PeliculasController {

    public static final String PELICULAS = "/peliculas";

    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public String mostrarPeliculas(Model model) {
        PeliculasResponse[] peliculas = peliculasService.getPeliculasResponse();

        model.addAttribute("peliculasList", peliculas);

        return "index.html";
    }
}
