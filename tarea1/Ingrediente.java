/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Victor
 */
public class Ingrediente {
    
    float cantidad;
    String unidad;
    String nombre;
     
    
    
    
	@Override
	public String toString() {
		return cantidad + " " + unidad + " " + " de " + nombre;
	}
	
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

    
}
