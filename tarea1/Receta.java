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
    ArrayList <String> preparacion= new ArrayList <String> ();
    ArrayList <Ingrediente> ingredientes= new ArrayList <Ingrediente> ();

    public Receta(String nombre) {
        this.nombre = nombre;
    }

    public Receta(String nombre, ArrayList<Ingrediente> ingredientes,ArrayList<String> preparacion) {
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

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(ArrayList<String> preparacion) {
        this.preparacion = preparacion;
    }  

    
    
}