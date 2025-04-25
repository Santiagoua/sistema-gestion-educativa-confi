package com.example.libroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Libro {
    @Id
    private String id;
    private String titulo;
    private String autorId;

    // Getters y setters
}
