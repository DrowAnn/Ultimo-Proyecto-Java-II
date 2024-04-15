package com.microservice.productos.service;

import com.microservice.productos.entity.Producto;

import java.util.Optional;

public interface IProductoService {

    Optional<Producto> getProducto(Long id);

    Producto saveProducto(Producto producto);

}