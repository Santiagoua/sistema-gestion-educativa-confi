package com.example.autorservice.service;

import com.example.autorservice.model.Autor;
import com.example.autorservice.repository.AutorRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Mono<Autor> crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }
}
