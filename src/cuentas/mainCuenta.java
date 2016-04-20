/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;
import java.util.*;
/**
 *
 * @author juanka y la formula 
 */
public class mainCuenta {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     java.util.Scanner lectura= new java.util.Scanner(System.in);
     ArrayList<Cuenta> cuentas= new ArrayList<>();
     Banco a = new Banco(cuentas);
 
     //Registro de cuentas
      int menuRegistro;
      System.out.println("Bienvenido  ¿Que cuenta desea registrar?");
      System.out.println(" 1. Cuenta corriente. 2. Cuenta de ahorros. 3. Cuenta de cheques.");
      menuRegistro= lectura.nextInt();
      String numCuenta;
      String nomCliente;
      double saldo;
      int[] fechaVencimiento= new int[3];
      double porcentajeInteres;
      double comisionPorChequera;
      double comisionPorChequeraSinSaldo;
    do {
      if(menuRegistro==1){
        System.out.println("Registro de cuenta corriente");    
      }
      if(menuRegistro==2){
        System.out.println("Registro de cuenta de ahorros");    
      }
      if(menuRegistro==3){
         System.out.println("Registro de cuenta de cheques");
      }
      System.out.println("Ingrese el nombre del cliente: ");
      nomCliente = lectura.next();
      System.out.println("Ingrese el numero de la nueva cuenta: ");
      numCuenta= lectura.next();
      System.out.println("Ingrese el saldo de la nueva cuenta: ");
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
      System.out.println("Bienvenido de nuevo  ¿Que cuenta desea registrar?");
      System.out.println(" 1. Cuenta corriente. 2. Cuenta de ahorros. 3. Cuenta de cheques. 0.No registrar mas cuentas");
      menuRegistro= lectura.nextInt();
     }while (menuRegistro!= 0);
       
     //Servicios cuenta
     
       System.out.println("¿Desea hacer alguna transaccion? ");
       int menuTransaccion;
       int menutr;
       System.out.println("1. Si. 0. No ");
       menuTransaccion = lectura.nextInt();
       HashMap<String, Cuenta> buscarCuentas= new HashMap<>();
         for(int i=0; i<cuentas.size(); i++){
           buscarCuentas.put(cuentas.get(i).getNumCuenta(), cuentas.get(i));    
            }
         do {if(menuTransaccion==1){
           Cuenta bandera;
         {String numCuentaBuscar;
            Cuenta cuentaEncontrada;   
            System.out.println(); 
            System.out.println("Digite el numero de cuenta en el que desea realizar la transaccion");
            numCuentaBuscar= lectura.next();
            cuentaEncontrada =  buscarCuentas.get(numCuentaBuscar);
            bandera= cuentaEncontrada;
          if(bandera == null){
            System.out.println("Cuenta " + numCuentaBuscar + " no encontrada" );
            System.out.println();
          }
          if(bandera != null) do{
              System.out.println("Cuenta " + numCuentaBuscar + " encontrada" );
                System.out.println("¿Que transaccion desea hacer?");
           System.out.println("1.Consultar datos. 2. Depositar. 3.Retirar");
           menutr= lectura.nextInt();
           if(menutr== 1){
             cuentaEncontrada.consultarDatos();
           }
           if(menutr== 2){
             double montoDepositar;
             System.out.println("Digite el monto a consignar");
            montoDepositar = lectura.nextDouble();
               cuentaEncontrada.depositar(montoDepositar);
               System.out.println("Su dinero ha sido consignado con exito ");
          }
           if(menutr== 3){
               double montoRetirar;
               System.out.println("Digite el monto a retirar");
              montoRetirar = lectura.nextDouble();
              cuentaEncontrada.retirar(montoRetirar);
              System.out.println("Su dinero ha sido retirado con exito ");
           }
           System.out.println("¿Desea hacer otra transaccion?");
      System.out.println(" 1.Si. 0.No. ");
      menuTransaccion= lectura.nextInt();
        }while(bandera==null);
      }     
         }       
              
    }while(menuTransaccion!= 0);
     }   
}
