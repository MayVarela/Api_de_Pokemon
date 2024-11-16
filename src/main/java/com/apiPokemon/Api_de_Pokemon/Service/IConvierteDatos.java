package com.apiPokemon.Api_de_Pokemon.Service;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase);
}
