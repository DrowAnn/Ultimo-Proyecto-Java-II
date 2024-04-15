package com.microservice.productos.controller;

import com.microservice.productos.entity.Producto;
import com.microservice.productos.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final IProductoService productoService;

    @GetMapping("/{id}")
    public Optional<Producto> obtenerProducto(@PathVariable Long id){
        return productoService.getProducto(id);
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

}