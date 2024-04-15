package com.microservice.productos.service;

import com.microservice.productos.entity.Categoria;

import java.util.Optional;

public interface ICategoriaService {

    public Optional<Categoria> getCategoria(Long id);

    public Categoria saveCategoria(Categoria categoria);

}