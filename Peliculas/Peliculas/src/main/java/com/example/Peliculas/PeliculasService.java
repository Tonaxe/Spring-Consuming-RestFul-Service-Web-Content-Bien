package com.example.Peliculas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PeliculasService {

    @Autowired
    RestTemplate restTemplate;

    protected PeliculasResponse[] getPeliculasResponse() {

        PeliculasResponse data[] = restTemplate.getForObject(
                "https://imdb-top-100-movies1.p.rapidapi.com/", PeliculasResponse[].class);

        return data;
    }
}
