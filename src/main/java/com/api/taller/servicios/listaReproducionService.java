package com.api.taller.servicios;

import java.util.List;

import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.repositories.listaReproducionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;

@Service
public class listaReproducionService {
    

    @Autowired
    listaReproducionRepository listaReproducionRepository;

    //Buscar todos
    public List<ListaReproduccion> listarListas(){
        return (List<ListaReproduccion>)listaReproducionRepository.findAll();
    }

        //buscar por ID
    public ResponseEntity<ListaReproduccion>listarListaID(Integer id){
        try {
            ListaReproduccion lista = listaReproducionRepository.findById(id).get();
            return new ResponseEntity<ListaReproduccion>(lista,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
