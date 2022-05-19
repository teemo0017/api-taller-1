package com.api.taller.servicios;

import java.util.List;

import com.api.taller.entidades.Cancion;
import com.api.taller.repositories.cancionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cancionService {
    
    @Autowired
    cancionRepository cancionRepository;

    public List<Cancion> listarCanciones(){
        return (List<Cancion>)cancionRepository.findAll();
    }


}
