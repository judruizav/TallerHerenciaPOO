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
public class Auto extends Vehiculo{
    
    protected int cantidadPasajeros;

    public Auto(int cantidadPasajeros, String numSerieMotor, String marca, int año, double precio) {
        super(numSerieMotor, marca, año, precio);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public String toString(){
      return super.toString() + " Cantidad de pasajeros: " + this.cantidadPasajeros;
    }
    
}
