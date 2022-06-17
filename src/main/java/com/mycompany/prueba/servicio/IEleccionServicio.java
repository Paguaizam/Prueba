/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prueba.servicio;

import java.util.List;
import com.mycompany.prueba.modelo.Eleccion;

/**
 *
 * @author Paul Aguaiza
 */
public interface IEleccionServicio {
    public Eleccion crear(Eleccion eleccion);
    public List<Eleccion> listar();
}
