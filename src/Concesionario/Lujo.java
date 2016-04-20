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
public class Lujo extends Auto{

    public Lujo(int cantidadPasajeros, String numSerieMotor, String marca, int año, double precio) {
        super(cantidadPasajeros, numSerieMotor, marca, año, precio);
    }    
    
    @Override
    public String toString(){
      return "Lujo " + "\n" + super.toString();
    }
}
