/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;
import java.util.*;
/**
 *
 * @author Julian
 */
public class mainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     java.util.Scanner lectura= new java.util.Scanner(System.in);
     ArrayList<Cuenta> cuentas= new ArrayList<Cuenta>();
     Banco banco= new Banco(cuentas);
     HashMap<String, Cuenta> buscarCuentas= new HashMap<>();
     for(int i=0; i<cuentas.size(); i++){
       buscarCuentas.put(cuentas.get(i).getNumCuenta(), cuentas.get(i));    
     } 
     //Registro de cuentas
      int menuRegistro;
      System.out.println("Menu de registro. 1. Cuenta corriente. 2. Cuenta de ahorros. 3. Cuenta de cheques.");
      menuRegistro= lectura.nextInt();
      String numCuenta;
      String nomCliente;
      double saldo;
      int[] fechaVencimiento= new int[3];
      double porcentajeInteres;
      double comisionPorChequera;
      double comisionPorChequeraSinSaldo;
      if(menuRegistro==1){
        System.out.println("Registro de cuenta corriente");    
      }
      if(menuRegistro==2){
        System.out.println("Registro de cuenta de ahorros");    
      }
      if(menuRegistro==3){
         System.out.println("Registro de cuenta de cheques");
      }
      System.out.print("Ingrese el nombre del cliente: ");
      nomCliente = lectura.nextLine();
      System.out.print("Ingrese el numero de la nueva cuenta: ");
      numCuenta= lectura.next();
      System.out.print("Ingrese el saldo de la nueva cuenta: ");
      saldo= lectura.nextDouble();
      //Cuenta corriente
      if(menuRegistro==1){
        Cuenta cuentaCo= new Cuenta(numCuenta,nomCliente,saldo);
        cuentas.add(cuentaCo);   
      }
      //Cuenta de ahorros
      if(menuRegistro==2){
        System.out.print("Ingrese el porcentaje de interes de la nueva cuenta: ");
        porcentajeInteres= lectura.nextDouble();
        System.out.println("Ingrese la fecha de vencimiento la nueva cuenta");
        System.out.print("Dia: ");
        fechaVencimiento[0]= lectura.nextInt();
        System.out.print("Mes: ");
        fechaVencimiento[1]= lectura.nextInt();
        System.out.print("Año: ");
        fechaVencimiento[2]= lectura.nextInt();
        CuentaAhorros cuentaAho= new CuentaAhorros(fechaVencimiento, porcentajeInteres,numCuenta,nomCliente,saldo);
        cuentas.add(cuentaAho); 
      }
      //Cuenta de cheques
      if(menuRegistro==2){
        System.out.print("Ingrese la comision a pagar por uso de chequera de la nueva cuenta: ");
        comisionPorChequera= lectura.nextDouble();
        System.out.print("Ingrese la comision a pagar por uso de chequera sin fondos suficientes de la nueva cuenta: ");
        comisionPorChequeraSinSaldo= lectura.nextDouble();
        CuentaCheques cuentaCheques= new CuentaCheques(comisionPorChequera, comisionPorChequeraSinSaldo, numCuenta,nomCliente,saldo);
        cuentas.add(cuentaCheques);
      }
      
     String numCuentaBuscar;  
     //Servicios cuenta
       System.out.println("Ingrese el numero de la cuenta que desea buscar: ");
    }
    
}
