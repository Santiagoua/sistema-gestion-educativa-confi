package com.example.libroservice.controller;

import com.example.libroservice.model.Libro;
import com.example.libroservice.service.LibroService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public Mono<Libro> crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping
    public Flux<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public Mono<Libro> buscarPorId(@PathVariable String id) {
        return libroService.buscarPorId(id);
    }

    @PutMapping("/{id}/autor")
    public Mono<Libro> asignarAutor(@PathVariable String id, @RequestBody String autorId) {
        return libroService.asignarAutor(id, autorId);
    }
}
