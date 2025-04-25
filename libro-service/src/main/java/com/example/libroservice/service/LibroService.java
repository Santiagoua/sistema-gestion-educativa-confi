package com.example.libroservice.service;

import com.example.libroservice.model.Libro;
import com.example.libroservice.repository.LibroRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Mono<Libro> crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Flux<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    public Mono<Libro> buscarPorId(String id) {
        return libroRepository.findById(id);
    }

    public Mono<Libro> asignarAutor(String id, String autorId) {
        return libroRepository.findById(id)
                .flatMap(libro -> {
                    libro.setAutorId(autorId);
                    return libroRepository.save(libro);
                });
    }
}
