/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoaliens;

/**
 *
 * @author Sebastian
 */
public class Aplicacion {

    public void menu(){
       java.util.Scanner lectura = new java.util.Scanner(System.in);
       int opcion = 0;
       System.out.println("¡Crea Tu Alien!");
       System.out.println("¡Bienvenido! En este juego podras crear tus aliens como quieras :3");
       System.out.println();
       System.out.println("Menu:");
       System.out.println("1: Crea tu Marciano");
       System.out.println("2: Crea tu Jupiteriano");
       System.out.println();
       opcion = lectura.nextInt();
       if(opcion == 1){
           System.out.println();
           System.out.println("Bien... Vamos a crear un Marciano");
           System.out.println();
           System.out.println("¿Que nombre le daras a tu marciano?");
           String nombre = lectura.next();
           System.out.println("¿Que color tendra?");
           String color = lectura.next();
           System.out.println("Muy bien, ¿cuantos ojos le pondras?");
           int numeroDeOjos = lectura.nextInt();
           System.out.println("Excelente, ¿Cuantas vidas tendra tu marciano?");
           int numeroDeVidas = lectura.nextInt();
           System.out.println("Y por ultimo, ¿Que habilidad quieres que tenga?");
           String habilidad = lectura.next();
           Alien marciano = new Marte(nombre,color,numeroDeOjos,numeroDeVidas,habilidad);
           System.out.println(marciano.toString());
       }
       if(opcion == 2){
           System.out.println();
           System.out.println("Bien... Vamos a crear un Jupiteriano");
           System.out.println();
           System.out.println("¿Que nombre le daras a tu Jupiteriano?");
           String nombre = lectura.next();
           System.out.println("¿Que color tendra?");
           String color = lectura.next();
           System.out.println("Muy bien, ¿cuantos ojos le pondras?");
           int numeroDeOjos = lectura.nextInt();
           System.out.println("Excelente, ¿Cuantas vidas tendra tu Jupiteriano?");
           int numeroDeVidas = lectura.nextInt();
           System.out.println("Y por ultimo, ¿Que habilidad quieres que tenga?");
           String habilidad = lectura.next();
           Alien jupiteriano = new Jupiter(nombre,color,numeroDeOjos,numeroDeVidas,habilidad);
           System.out.println(jupiteriano.toString());
       }
       System.out.println();
       System.out.println("¡Gracias por haber jugado a crear tu Alien!");
    }   
}