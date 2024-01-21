package com.example.Peliculas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
record PeliculasResponse(
        String id,
        String title,
        String description,
        String link,
        @JsonProperty("Director") ArrayList<String> director,
        @JsonProperty("Writers") ArrayList<String> writers,
        @JsonProperty("Stars") ArrayList<String> stars,
        ArrayList<String> genre,
        ArrayList<ArrayList<String>> images,
        String imdbid,
        int rank,
        String rating,
        String year
) {}
