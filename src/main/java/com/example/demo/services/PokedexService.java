package com.example.demo.services;

import com.example.demo.entitties.Pokedex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<Pokedex> getPokedex() {
        return restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon?limit=10", Pokedex.class);
    }

}
