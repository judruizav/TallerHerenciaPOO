/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapizzeria;


public class Pizza {
    protected String masa;
    protected String salsa;
    protected String[] ingredientes;
    
    public Pizza(){
      this.masa= "Regular";
      this.salsa= "Tomate";
    }
    
    public void preparar(){
      System.out.println("Preparar y amasar masa: " + this.masa);
      System.out.println("Adicionar salsa de: " + this.salsa);
      System.out.print("Adicionar: " + "");
      for(int i=0; i<this.ingredientes.length-1; i++){
        System.out.print(this.ingredientes[i] + ",");      
      }
      System.out.println(this.ingredientes[this.ingredientes.length-1]);
    }
    
    public void hornear(){
      System.out.println("Hornear pizza: Duración: 15mins.");
    }
    
    public void cortar(){
      System.out.println("Cortar pizza: 12 porciones.");
    }
    
    public void empacar(){
      System.out.println("Empacar pizza: Caja ecológica");
    }
}
