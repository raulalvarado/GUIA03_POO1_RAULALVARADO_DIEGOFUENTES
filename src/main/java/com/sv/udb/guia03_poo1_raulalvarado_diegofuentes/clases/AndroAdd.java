/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class AndroAdd 
{
    ArrayList<String> androides= new ArrayList<>();

    public AndroAdd() {
    }
    
    public ArrayList nombres(String n)
    {
        String Nombre;
        androides.add(n);
        for(String val: androides)
            Nombre=androides.get(n.toString());
    }
    
}
