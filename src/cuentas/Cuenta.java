/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author 
 */
public class Cuenta {
    
    protected String numCuenta;
    protected String nomCliente;
    protected double saldo;

    public Cuenta(String numCuenta, String nomCliente, double saldo) {
        this.numCuenta = numCuenta;
        this.nomCliente = nomCliente;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    
    public void consultarDatos(){
      System.out.print("Nombre: ");
      System.out.println(this.nomCliente);
      System.out.print("Numero de cuenta: ");
      System.out.println(this.numCuenta);
      System.out.print("Saldo: ");
      System.out.println(this.saldo);
    }
    
    public void depositar(double monto){
      this.saldo+= monto;
    }
    
    public void retirar (double monto){
      if(this.saldo < monto){
        System.out.println("Saldo insuficiente");
      }else{
        this.saldo-=monto;   
      }    
    }
     
     


}
