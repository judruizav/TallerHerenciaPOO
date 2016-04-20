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
public class Queso extends Pizza {
    public Queso(){
      super();
      this.masa= "Corteza regular";
      this.ingredientes= new String[2];
      this.ingredientes[0]= "Queso mozzarela fresco";
      this.ingredientes[1]= " Parmesano";
    }

    public String getMasa() {
        return this.masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String[] getIngredientes() {
        return this.ingredientes;
    }
    
    
    
}