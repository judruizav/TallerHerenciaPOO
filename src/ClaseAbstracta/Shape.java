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

public abstract class Shape {
  protected int numSides;

  public Shape(int numSides) {
    this.numSides = numSides;
  }

  public int getNumSides() {
      return numSides;
  }
  
  public abstract double getArea();
  public abstract double getPerimeter();
}
