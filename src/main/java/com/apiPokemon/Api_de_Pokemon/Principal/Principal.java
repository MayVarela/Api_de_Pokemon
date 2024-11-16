package com.apiPokemon.Api_de_Pokemon.Principal;

import com.apiPokemon.Api_de_Pokemon.Model.ObjetoPrincipal;
import com.apiPokemon.Api_de_Pokemon.Model.Pokemon;
import com.apiPokemon.Api_de_Pokemon.Service.ConsumoApi;
import com.apiPokemon.Api_de_Pokemon.Service.ConvierteDatos;

import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConvierteDatos conversor = new ConvierteDatos();

    private final String URLlimit = "https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0";

    public void muestraMenu() {
        Scanner teclado = new Scanner(System.in);

        var json = consumoApi.obtenerDatos(URLlimit);
        var datos = conversor.obtenerDatos(json, ObjetoPrincipal.class);
        int cantidadPokemonDisponibles = datos.cantidad();

        System.out.println("********************************************************");
        System.out.println("Cantidad de pokemon disponibles: " + cantidadPokemonDisponibles);
        System.out.println("********************************************************");
        System.out.println("Porfavor Escribe el nombre del Pokemon que deseas buscar");
        String busquedaPokemon = teclado.nextLine();
        Optional<Pokemon> pokemonBuscado = datos.resultados().stream()
                .filter(l-> l.nombre().toUpperCase().contains(busquedaPokemon.toUpperCase()))
                .findFirst();
        if (pokemonBuscado.isPresent()){
            System.out.println("Pokemon encontrado");
            System.out.println(pokemonBuscado.get());
        }else {
            System.out.println("Pokemon no encontrado");
        }


    }
}
