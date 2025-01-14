package com.alura.LiterAlura.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String Json, Class<T> clase);
}
