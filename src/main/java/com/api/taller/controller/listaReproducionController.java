package com.api.taller.controller;

import java.util.List;

import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.servicios.listaReproducionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class listaReproducionController {
    @Autowired
    listaReproducionService listaReproducionService;


    @GetMapping("/lista-reproducion")
    public List<ListaReproduccion> listarListas(){
        return listaReproducionService.listarListas();
    }

    @GetMapping("/lista-reproducion/{id}")
    public ResponseEntity<ListaReproduccion> listarListaID (@PathVariable Integer id){
        return listaReproducionService.listarListaID(id);
    }

}
