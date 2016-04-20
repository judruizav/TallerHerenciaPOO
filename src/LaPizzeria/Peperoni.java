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
public class Peperoni extends Pizza{
    public Peperoni(){ 
    super();
      this.ingredientes= new String[3];
      this.ingredientes[0]= "Rodajas de peperoni ";
      this.ingredientes[1]= "Rodajas de cebolla ";
      this.ingredientes[2]= "Queso parmesano rallado.";
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }
    
}
