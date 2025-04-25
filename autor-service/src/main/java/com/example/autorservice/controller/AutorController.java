package com.example.autorservice.controller;

import com.example.autorservice.model.Autor;
import com.example.autorservice.service.AutorService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/autores")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public Mono<Autor> crearAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }
}
