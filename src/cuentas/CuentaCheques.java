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
public class CuentaCheques extends Cuenta {
    
    private double comisionPorChequera;
    private double comisionPorChequeraSinSaldo;

    public CuentaCheques(double comisionPorChequera, double comisionPorChequeraSinSaldo, String numCuenta, String nomCliente, double saldo) {
        super(numCuenta, nomCliente, saldo);
        this.comisionPorChequera = comisionPorChequera;
        this.comisionPorChequeraSinSaldo = comisionPorChequeraSinSaldo;
    }
    
    @Override
    public void consultarDatos(){
      super.consultarDatos();
      System.out.print("Comision por uso de chequera: ");
      System.out.println(this.comisionPorChequera);
      System.out.print("Comision por emision de cheques sin saldo: ");
      System.out.println(this.comisionPorChequeraSinSaldo);
    }
    
    @Override
    public void retirar(double monto){
      super.retirar(monto);
      if(monto>this.saldo){
        this.saldo-=this.comisionPorChequeraSinSaldo;
      }
      if(monto<this.saldo){
        this.saldo-=this.comisionPorChequera;    
      }
    }
}
