/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import java.util.List;
import com.mycompany.prueba.modelo.Eleccion;
import com.mycompany.prueba.servicio.EleccionServicio;

/**
 *
 * @author Paul Aguaiza
 */
public class EleccionControl {
    private final EleccionServicio capitanServicio = new EleccionServicio();
    
    public Eleccion crear(String [] params){
        var eleccion = new Eleccion(Integer.valueOf(params[2]),params[2]);
        this.capitanServicio.crear(eleccion);
        return eleccion;
    }
    
    public List<Eleccion> listar()
    {
        return this.EleccionServicio.listar();
    }
}
