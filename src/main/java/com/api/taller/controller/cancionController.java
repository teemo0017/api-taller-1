package com.api.taller.controller;

import com.api.taller.servicios.cancionService;

import java.util.List;

import com.api.taller.entidades.Cancion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class cancionController {
    

    @Autowired
    cancionService cancionService;

    @GetMapping("/canciones")
    public List<Cancion> listarCanciones(){
        return cancionService.listarCanciones();
    }


    @GetMapping("/cancion/{id}")
    public ResponseEntity<Cancion> listarCancionID (@PathVariable Integer id){
        return cancionService.listarCancionID(id);
    }

}
