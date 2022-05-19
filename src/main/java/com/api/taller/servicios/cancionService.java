package com.api.taller.servicios;

import java.util.List;

import com.api.taller.entidades.Cancion;
import com.api.taller.repositories.cancionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class cancionService {
    
    @Autowired
    cancionRepository cancionRepository;

    public List<Cancion> listarCanciones(){
        return (List<Cancion>)cancionRepository.findAll();
    }


    public ResponseEntity<Cancion> listarCancionID(Integer id){
        try {
            Cancion cancion = cancionRepository.findById(id).get();
            return new ResponseEntity<Cancion>(cancion, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Cancion>(HttpStatus.NOT_FOUND);
        }
    }

}
