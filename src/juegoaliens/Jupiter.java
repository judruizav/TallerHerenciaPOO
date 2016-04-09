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
public class Jupiter extends Alien{

    public Jupiter(String nombre, String color, int numeroDeOjos, int numeroDeVidas, String habilidad) {
        super(nombre, color, numeroDeOjos, numeroDeVidas, habilidad);
    }
    
    @Override
    public String toString() {
        return "Tu Jupiteriano tiene las siguientes caracteristicas: " +
               "Nombre: " + getNombre() + ", " +
               "Color: " + getColor() + ", " +
               "Numero de Ojos: " + getNumeroDeOjos() + ", " +
               "Numero de Vidas: " + getNumeroDeVidas() + ", " +
               "Habilidad: " + getHabilidad();      
    }
}