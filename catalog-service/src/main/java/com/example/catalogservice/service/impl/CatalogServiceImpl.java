package com.example.catalogservice.service.impl;

import com.example.catalogservice.service.CatalogService;
import com.example.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<Object> getMovie(String genre) {
        return movieFeign.findMovie(genre);
    }
}
