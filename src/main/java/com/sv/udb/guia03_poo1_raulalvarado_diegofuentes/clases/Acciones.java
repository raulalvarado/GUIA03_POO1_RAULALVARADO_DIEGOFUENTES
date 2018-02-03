/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.guia03_poo1_raulalvarado_diegofuentes.clases;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Acciones {
    private ArrayList<AndroControl> androides;
    private ArrayList<AccionControl> acciones;

    public Acciones() {
        androides = new ArrayList<>();
        acciones = new ArrayList<>();
    }
    
    public String AgregarAndro (String name) {
        
        try {
            for (AndroControl android : androides) 
                if (name.equals(android.androx.getNombre()))
                    return "NoName";
            
            androides.add(new AndroControl(name));
        
            return "Agregado con exito";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error al agregar";
        }
    }
    
    public String AgregarAccion (String name, int energy) {
        
        try {
            if (energy <= 0 || energy > 100)
                return "Energia agotada";
            
            for (AccionControl action : acciones) 
                if (name.equals(action.androx.getNombre()))
                    return "Nombre no disponible";
     
            acciones.add(new AccionControl(name, energy));
        
            return "Agregado con exito";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error al agregar";
        }
    }
    
    public ArrayList<AndroControl> getAndroides (int type) {
        ArrayList<AndroControl> resultAndroides = new ArrayList<>();
        
        ArrayList<AndroControl> copyAndroids = (ArrayList<AndroControl>) androides.clone();
        
        switch (type) {
            case 1:
                do {
                    AndroControl copyAndroid = null;
                    int B = 100;
                    for (AndroControl android : copyAndroids) {
                        if (android.androx.getEnergia() <= B) {
                            copyAndroid = android;
                            B = android.androx.getEnergia();
                        }
                    }
                    resultAndroides.add(copyAndroid);
                    copyAndroids.remove(copyAndroid);
                } while (!copyAndroids.isEmpty());
                break;
            case 2:
                for (AndroControl android : androides)
                    if (android.androx.getEnergia() >= 50)
                        resultAndroides.add(android);
                break;
            case 3:
                do {
                    AndroControl copyAndroid = null;
                    int higher = 0;
                    for (AndroControl android : copyAndroids) {
                        if (android.androx.getEnergia() >= higher) {
                            copyAndroid = android;
                            higher = android.androx.getEnergia();
                        }
                    }
                    resultAndroides.add(copyAndroid);
                    copyAndroids.remove(copyAndroid);
                } while (!copyAndroids.isEmpty());
                
                if (resultAndroides.size() > 3)
                    resultAndroides = new ArrayList<>(resultAndroides.subList(0, 3));
                
                break;
            case 4:
                resultAndroides = androides;
                break;
        }
        
        return resultAndroides;
    }
    
    public ArrayList<AccionControl> getActions () {
        return acciones;
    }
    
    
    public String tarea (AndroControl android, AccionControl action) {
        
        try {
            
            for (AndroControl dsAndroid : androides) 
                if (android == dsAndroid) 
                    dsAndroid.androx.setEnergia(android.androx.getEnergia() - action.androx.getEnergia());
            
            return "AccDone";
            
        }
        catch (Exception e) {
            e.printStackTrace();
            return "AccErr";
        }
        
    }
    
}
