package com.example.Peliculas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PeliculasApplication {

	private static final Logger log = LoggerFactory.getLogger(PeliculasApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PeliculasApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder
				.defaultHeader("X-RapidAPI-Key","57086c5873mshf27fb624c60aa2bp19a906jsndbe2f92e3a7f")
				.build();
	}
}
