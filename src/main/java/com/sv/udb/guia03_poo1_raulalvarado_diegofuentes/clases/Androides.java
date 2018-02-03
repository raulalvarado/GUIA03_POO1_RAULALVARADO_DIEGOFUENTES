/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases;


/**
 *
 * @author Daniel
 */
public class Androides {
    
    String nombre;
    int energia;
    
    public Androides() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return nombre + "  " + energia + "%";
    }
    
}
