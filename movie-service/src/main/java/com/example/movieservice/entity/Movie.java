package com.example.movieservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
