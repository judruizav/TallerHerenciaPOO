/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;

/**
 *
 * @author Julian
 */
public class Vehiculo {
    
    protected String numSerieMotor;
    protected String marca;
    protected int año;
    protected double precio;

    public Vehiculo(String numSerieMotor, String marca, int año, double precio) {
        this.numSerieMotor = numSerieMotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }    
}
