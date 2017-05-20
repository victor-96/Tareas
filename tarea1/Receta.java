/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Receta {
    
    String nombre;
    String ingredientes;
    ArrayList <String> preparacion= new ArrayList <String> ();

    public Receta(String nombre) {
        this.nombre = nombre;
    }

    public Receta(String nombre, ArrayList<String> preparacion ,String ingredientes) {
        this.nombre = nombre;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(ArrayList<String> preparacion) {
        this.preparacion = preparacion;
    }

    
    
}
