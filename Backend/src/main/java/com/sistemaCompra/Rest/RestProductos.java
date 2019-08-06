package com.sistemaCompra.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaCompra.model.Producto;
import com.sistemaCompra.repository.IProductoRepo;

@RestController
@RequestMapping("/productos")
public class RestProductos {
	
	@Autowired
	private IProductoRepo repoProductos;
	
	@GetMapping
	public List<Producto> listar(){
		return repoProductos.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody Producto producto){
		repoProductos.save(producto);
	}
	
	@PutMapping
	public void modificar(@RequestBody Producto producto){
		repoProductos.save(producto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repoProductos.deleteById(id);
	}


}
