package com.api.taller.servicios;

import java.util.List;

import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.repositories.listaReproducionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class listaReproducionService {
    

    @Autowired
    listaReproducionRepository listaReproducionRepository;


    public List<ListaReproduccion> listarListas(){
        return (List<ListaReproduccion>)listaReproducionRepository.findAll();
    }

}
