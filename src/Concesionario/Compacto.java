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
public class Compacto extends Auto{

    public Compacto(int cantidadPasajeros, String numSerieMotor, String marca, int año, double precio) {
        super(cantidadPasajeros, numSerieMotor, marca, año, precio);
    }
    
    @Override
    public String toString(){
      return "Compacto " + "\n" + super.toString();
    }
}
