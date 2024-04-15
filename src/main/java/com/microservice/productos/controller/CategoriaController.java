package com.microservice.productos.controller;

import com.microservice.productos.entity.Categoria;
import com.microservice.productos.service.ICategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final ICategoriaService categoriaService;

    @GetMapping("/{id}")
    public Optional<Categoria> obtenerCategoria(@PathVariable Long id){
        return categoriaService.getCategoria(id);
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria){
        return categoriaService.saveCategoria(categoria);
    }

}