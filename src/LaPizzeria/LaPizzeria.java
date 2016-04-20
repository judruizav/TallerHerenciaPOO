/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapizzeria;

/**
 *
 * @author IVAN
 */
public class LaPizzeria {
    
            
    public static void main(String[] args) {
        System.out.println("*** BIENVENIDO A LA PIZZERIApp ***");
        System.out.println("");
        java.util.Scanner lectura= new java.util.Scanner(System.in);
        Pizza pizza = null;
        int menu;
        int n=0;
        while(n!=2){
        System.out.println("Qué pizza desea pedir");
        System.out.println("Presione:");
        System.out.println("1 : Peperoni    2 : Queso     3 : Vegetariana");
        menu = lectura.nextInt();
        if(menu==1){
           pizza = new Peperoni();
        }
        if(menu==2){
           pizza = new Queso();
        }
        if(menu==3){
           pizza = new Vegetariana();
        } 
        System.out.println("");
        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.empacar();

        
        System.out.println("");
        System.out.println("Desea pedir otra pizza?");
        System.out.println("1: Sí    2: No");
        n=lectura.nextInt();
        }
        System.out.println("");
        System.out.println("***GRACIAS POR SU PEDIDO, VUELVA PRONTO***");
        System.out.println("By: EV :3");
    }
}
