/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases;
import com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases.Androides;
import com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases.Acciones;
import com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases.Androides;
/**
 *
 * @author Daniel
 */
public class AndroControl {
    
    public AndroControl() {
    }
    
    Androides androx= new Androides();
    public AndroControl(String nombre) {
        androx.nombre = nombre;
        androx.energia = 100;
    }
    
}
