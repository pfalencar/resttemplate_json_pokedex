package com.example.demo.controllers;

import com.example.demo.entitties.Pokedex;
import com.example.demo.services.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {
    @Autowired
    private PokedexService pokedexService;

    @GetMapping
    public ResponseEntity<Pokedex> getPokedex() {
        return pokedexService.getPokedex();
    }
}
