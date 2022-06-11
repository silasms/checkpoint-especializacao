package com.example.movieservice.service;

import com.example.movieservice.dto.MovieDTO;
import com.example.movieservice.entity.Movie;

import java.util.List;

public interface MovieService {
    void save(MovieDTO movie);
    List<MovieDTO> findByGenre(String genre);
}
