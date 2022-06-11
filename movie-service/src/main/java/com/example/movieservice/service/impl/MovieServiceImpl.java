package com.example.movieservice.service.impl;

import com.example.movieservice.dto.MovieDTO;
import com.example.movieservice.entity.Movie;
import com.example.movieservice.repository.MovieRepository;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO dto) {
        var movie = new Movie();
        movie.setName(dto.getName());
        movie.setGenre(dto.getGenre());
        movie.setUrlStream(dto.getUrlStream());
        this.repository.save(movie);
    }

    @Override
    public List<MovieDTO> findByGenre(String genre) {
        var movies = this.repository.findByGenre(genre);
        List<MovieDTO> moviesDTO = new ArrayList<>();
        for (var movie : movies) {
            var movieDTO = new MovieDTO();
            movieDTO.setName(movie.getName());
            movieDTO.setGenre(movie.getGenre());
            movieDTO.setUrlStream(movie.getUrlStream());
            moviesDTO.add(movieDTO);
        }
        return moviesDTO;
    }
}
