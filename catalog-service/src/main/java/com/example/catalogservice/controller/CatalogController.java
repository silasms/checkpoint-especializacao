package com.example.catalogservice.controller;

import com.example.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @GetMapping("/{genre}")
    public List<Object> findMovie(@PathVariable String genre) {
        return catalogService.getMovie(genre);
    }
}
