/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Julian
 */
public class CuentaAhorros extends Cuenta {
    
    private int[] fechaVencimiento;
    private double porcentajeDeInteres;

    public CuentaAhorros(int[] fechaVencimiento, double porcentajeDeInteres, String numCuenta, String nomCliente, double saldo) {
        super(numCuenta, nomCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeDeInteres = porcentajeDeInteres;
    }
    
    @Override
    public void consultarDatos(){
      super.consultarDatos();
      System.out.print("Porcentaje de interes: ");
      System.out.print(this.porcentajeDeInteres);
      System.out.print("Fecha de vencimiento: ");
      System.out.println(this.fechaVencimiento[0]+ "/" + this.fechaVencimiento[1] + "/" + this.fechaVencimiento[2]);
    }

    public void depositar(int[] fecha) {
      double monto= (this.porcentajeDeInteres/100)*this.saldo;  
      if(fecha[0]==1){
      super.depositar(monto); 
      }
    }
    
    public void retirar(double monto, int[] fecha){
      boolean bandera= true;
      for(int i=0; i<this.fechaVencimiento.length; i++){
        bandera&= (fecha[i]==this.fechaVencimiento[i]);      
      }
      if(bandera){
        super.retirar(monto);    
      }else{
        System.out.println("Puede retirar hasta " + this.fechaVencimiento[0] + "/" + this.fechaVencimiento[1] + "/" + this.fechaVencimiento[2]);
      }    
    }
           
}
