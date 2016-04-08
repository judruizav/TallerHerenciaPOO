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
public class Camioneta extends Vehiculo{
    
    private double cargaKgs;
    private int numEjes;
    private int numRodadas;

    public Camioneta(double cargaKgs, int numEjes, int numRodadas, String numSerieMotor, String marca, int año, double precio) {
        super(numSerieMotor, marca, año, precio);
        this.cargaKgs = cargaKgs;
        this.numEjes = numEjes;
        this.numRodadas = numRodadas;
    }  
}
