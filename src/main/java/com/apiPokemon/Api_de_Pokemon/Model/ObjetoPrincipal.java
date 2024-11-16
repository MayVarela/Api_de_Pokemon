package com.apiPokemon.Api_de_Pokemon.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ObjetoPrincipal(
        @JsonAlias("count") int cantidad,
        @JsonAlias("results") List<Pokemon> resultados
) {
}
