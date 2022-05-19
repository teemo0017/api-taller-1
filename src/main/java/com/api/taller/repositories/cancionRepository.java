package com.api.taller.repositories;

import com.api.taller.entidades.Cancion;

import org.springframework.data.repository.CrudRepository;

public interface cancionRepository extends CrudRepository<Cancion,Integer> {
    
}
