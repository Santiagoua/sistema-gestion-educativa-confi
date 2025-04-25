package com.example.autorservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Autor {
    @Id
    private String id;
    private String nombre;

    // Getters y setters
}
