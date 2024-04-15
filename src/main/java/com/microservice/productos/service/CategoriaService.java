package com.microservice.productos.service;

import com.microservice.productos.entity.Categoria;
import com.microservice.productos.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService implements  ICategoriaService{

    private final CategoriaRepository categoriaRepository;

    @Override
    public Optional<Categoria> getCategoria(Long id){
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}