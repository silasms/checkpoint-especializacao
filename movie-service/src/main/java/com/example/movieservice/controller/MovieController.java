package com.example.movieservice.controller;

import com.example.movieservice.dto.MovieDTO;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping()
    public ResponseEntity<String> save(@RequestBody MovieDTO dto) {
        if (dto.getGenre() == null || dto.getName() == null || dto.getUrlStream() == null) {
            return ResponseEntity.status(500).body("Valor(es) nulo(s)");
        }
        this.service.save(dto);
        return ResponseEntity.ok("Salvo com sucesso");
    }

    @GetMapping("/{genre}")
    public List<MovieDTO> findByGenre(@PathVariable String genre) {
        return this.service.findByGenre(genre);
    }
}
