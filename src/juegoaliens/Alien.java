/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoaliens;

/**
 *
 * @author Sebastian
 */
public class Alien {
    
    protected String nombre;
    protected String color;
    protected int numeroDeOjos;
    protected int numeroDeVidas;
    protected String habilidad;

    public Alien(String nombre, String color, int numeroDeOjos, int numeroDeVidas, String habilidad) {
        this.nombre = nombre;
        this.color = color;
        this.numeroDeOjos = numeroDeOjos;
        this.numeroDeVidas = numeroDeVidas;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDeOjos() {
        return numeroDeOjos;
    }

    public void setNumeroDeOjos(int numeroDeOjos) {
        this.numeroDeOjos = numeroDeOjos;
    }

    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
    @Override
    public String toString() {
        return "Alien{" + "nombre=" + getNombre() + ", color=" + getColor() + ", numeroDeOjos=" + getNumeroDeOjos() + ", numeroDeVidas=" + getNumeroDeVidas() + ", habilidad=" + getHabilidad() + '}';
    }
    
}
