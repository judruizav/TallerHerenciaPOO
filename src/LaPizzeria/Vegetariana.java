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
public class Vegetariana extends Pizza {
    public Vegetariana(){
      super();
      this.ingredientes= new String[6];
      this.ingredientes[0]= "Mozzarella";
      this.ingredientes[1]= " Parmesano rallado";
      this.ingredientes[2]= " Cebolla picada";
      this.ingredientes[3]= " Hongos en rebanadas";
      this.ingredientes[4]= " Pimienta roja en rodajas";
      this.ingredientes[5]= " Aceitunas negras rebanadas";
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String[] getIngredientes() {
        return this.ingredientes;
    }
    
}
