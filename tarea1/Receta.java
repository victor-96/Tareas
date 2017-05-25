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
    int personas=4;
    String autor;

    public void addIngrediente(Ingrediente ingrediente)
    {
    	this.ingredientes.add(ingrediente);
    }
    
    public void addPreparacion(String preparacion)
    {
    	this.preparacion.add(preparacion);
    }
    
   
    public String listaringredientes()
    {
    	String lista="";
    	for(Ingrediente i: ingredientes)
    	lista+=i.toString()+"\n";
    	return(lista);
    }
    
    public String listarpreparacion()
    {
    	String lista="";
    	for(int i=0;i<preparacion.size();i++)
    	{
    	int paso=i+1;
    	lista+="Paso " + paso + ":"
    	+preparacion+preparacion.get(i)+"\n";
    	}
    	return(lista);
    }
    
    @Override
	public String toString() {
		return "Receta:nombre.toupperCase()" + "\nIngredientes\n" + ingredientes + 
				listaringredientes() + preparacion + listarpreparacion();
	}
   

	public Receta(String nombre) {
        this.nombre = nombre;
    }

    

    public Receta(String nombre, ArrayList<String> preparacion, ArrayList<Ingrediente> ingredientes, int personas,
			String autor) {
		super();
		this.nombre = nombre;
		this.preparacion = preparacion;
		this.ingredientes = ingredientes;
		this.personas = personas;
		this.autor = autor;
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

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}  
   
	public Receta recetaPara(int personas)
	{
		return new Receta(nombre,preparacion,ingredientes,personas,autor);
		
	}
	
}
