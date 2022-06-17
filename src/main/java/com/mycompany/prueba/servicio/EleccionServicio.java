/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.servicio;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.prueba.modelo.Eleccion;
/**
 *
 * @author Paul Aguaiza
 */
public class EleccionServicio implements IEleccionServicio {
     private final List<Eleccion> EleccionList = new ArrayList<>();
    
    @Override
    public Eleccion crear(Eleccion eleccion) {
        this.EleccionList.add(eleccion);
        return eleccion;
    }

    @Override
    public List<Eleccion> listar() {
        return this.EleccionList;
    }
}
