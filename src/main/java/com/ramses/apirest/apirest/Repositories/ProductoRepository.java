package com.ramses.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramses.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    

}
