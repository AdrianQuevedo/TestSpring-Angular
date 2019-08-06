package com.sistemaCompra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemaCompra.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

	
}
