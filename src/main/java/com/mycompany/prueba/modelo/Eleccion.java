/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.modelo;

/**
 *
 * @author Paul Aguaiza
 */
public class Eleccion {
    private String tipoDeEleccion;
    private String lugarVotacion;
    private int Numerovotos;

    public Eleccion(String tipoDeEleccion, String lugarVotacion, int Numerovotos) {
        this.tipoDeEleccion = tipoDeEleccion;
        this.lugarVotacion = lugarVotacion;
        this.Numerovotos = Numerovotos;
    }

    public String getTipoDeEleccion() {
        return tipoDeEleccion;
    }

    public void setTipoDeEleccion(String tipoDeEleccion) {
        this.tipoDeEleccion = tipoDeEleccion;
    }

    public String getLugarVotacion() {
        return lugarVotacion;
    }

    public void setLugarVotacion(String lugarVotacion) {
        this.lugarVotacion = lugarVotacion;
    }

    public int getNumerovotos() {
        return Numerovotos;
    }

    public void setNumerovotos(int Numerovotos) {
        this.Numerovotos = Numerovotos;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "tipoDeEleccion=" + tipoDeEleccion + ", lugarVotacion=" 
                + lugarVotacion + ", Numerovotos=" + Numerovotos + '}';
    }
    

    
    
}
