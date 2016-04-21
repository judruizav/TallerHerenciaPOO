/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author IVAN
 */
public class ClaseAbstracta {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    java.util.Scanner lectura = new java.util.Scanner(System.in);
    int m=0;
    double width;
    double height;
    while(m!=2){
      
      System.out.println("Presione: 1=Rectángulo    2=Triángulo");
      int menu = lectura.nextInt();
      if(menu==1){
        System.out.println("Digite la altura del rectangulo: ");
        height=lectura.nextInt();
        System.out.println("Digite la base del rectangulo: ");
        width=lectura.nextInt();
        Rectangle r = new Rectangle(height,width,4);
        System.out.println ("El área del rectángulo es: "+r.getArea());
        System.out.println ("El perímetro del rectángulo es: "+r.getPerimeter());
      }
      if(menu==2){
        System.out.println("Digite la altura del triangulo: ");
        height = lectura.nextInt();
        System.out.println("Digite la base del triangulo: ");
        width = lectura.nextInt();
        Triangle t= new Triangle(height,width,3);
        System.out.println ("El área del triángulo es: "+ t.getArea());
        System.out.println ("El perímetro del triángulo es: "+ t.getPerimeter());
      }
      System.out.println("Presione: 1=Ingresar otra figura     2=SALIR");
      m = lectura.nextInt();  
    }
    
  }
    
}
