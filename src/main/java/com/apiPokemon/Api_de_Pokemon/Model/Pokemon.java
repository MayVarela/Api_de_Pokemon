package com.apiPokemon.Api_de_Pokemon.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Pokemon(
        @JsonAlias("name") String nombre,
        @JsonAlias("url") String habilidades
) {
}
