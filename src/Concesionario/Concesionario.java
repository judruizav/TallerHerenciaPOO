/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Julian
 */
public class Concesionario {

    public static void main(String[] args) {
      Scanner lectura = new Scanner(System.in);
      int menu;
      int menuRe;
      int menuAutos;
      ArrayList<Vehiculo> vehiculos = new ArrayList<>();
      //Vehiculos Pre-cargados
      // Chevrolet, Toyota, Nissan, Renault
      Camioneta camioneta= new Camioneta(1200, 4, 7, "235433432", "Chevrolet", 2014, 60000000);
      Compacto compacto= new Compacto(4, "3424324343", "Renault", 2015, 30000000);
      Lujo lujo= new Lujo(2, "099887634", "Nissan", 2016, 130000000);
      Vagoneta vagoneta= new Vagoneta(8, "4361360982", "Toyota", 2015, 40000000);
      vehiculos.add(camioneta);
      vehiculos.add(compacto);
      vehiculos.add(lujo);
      vehiculos.add(vagoneta);
      String marca;
      String numSerieMotor;
      int año;
      double precio;
      double cargaKgs;
      int numEjes;
      int numRodadas;
      int cantidadPasajeros;
      //Registro de vehiculos
      do{System.out.println("Opciones");
      System.out.println("1. Registrar vehiculo. 2. Ver vehiculos registrados. 0. Salir.");
      menu = lectura.nextInt();
      if (menu == 1){
        System.out.println("Bienvenido al menu de registro");
        System.out.println("Opciones");
        System.out.println("1. Registrar camioneta. 2. Registrar auto.");
        menuRe= lectura.nextInt();  
        System.out.println("Ingrese la marca del vehiculo: ");  
        marca= lectura.next();
        System.out.println("Ingrese el numero de serie del motor: ");
        numSerieMotor = lectura.next();
        System.out.println("Ingrese el año en el que se ensamblo el vehiculo: ");
        año = lectura.nextInt();
        System.out.println("Ingrese el precio del vehiculo: ");
        precio= lectura.nextDouble();
        if(menuRe== 1){
          //Camioneta
          System.out.println("Ingrese la carga en Kgs que puede soportar la camioneta: ");
          cargaKgs = lectura.nextDouble(); 
          System.out.println("Ingrese el numero de ejes que posee la camioneta: ");
          numEjes = lectura.nextInt();
          System.out.println("Ingrese el numero de rodadas de la camioneta: ");
          numRodadas = lectura.nextInt();
          Camioneta c= new Camioneta(cargaKgs, numEjes, numRodadas, numSerieMotor, marca, año, precio);    
          vehiculos.add(c);    
        }
        if (menuRe==2){
          //Autos
          System.out.println("Opciones");
          System.out.println("1. Registrar auto compacto. 2.Registrar auto de lujo. 3.Registrar vagoneta");
          menuAutos= lectura.nextInt();
          System.out.println("Ingrese la cantidad de pasajeros que puede alojar el auto: ");
          cantidadPasajeros = lectura.nextInt();
        if(menuAutos==1){
            //Compacto  
            Compacto com= new Compacto(cantidadPasajeros,numSerieMotor, marca, año, precio);
            vehiculos.add(com);    
          }
          if(menuAutos==2){
            //Lujo  
            Lujo l= new Lujo(cantidadPasajeros,numSerieMotor, marca, año, precio);
            vehiculos.add(l);   
          }
          if(menuAutos==2){
            //Vagoneta
            Vagoneta v= new Vagoneta(cantidadPasajeros,numSerieMotor, marca, año, precio);    
            vehiculos.add(v);    
          }    
        }
      }
      if(menu==2){
        //Imprimir
        System.out.println("Vehiculos Registrados");
        for(int i=0; i<vehiculos.size(); i++){
          System.out.println(vehiculos.get(i).toString());
          System.out.println();
        }
      }
      }while(menu!=0);
    }
    
}
