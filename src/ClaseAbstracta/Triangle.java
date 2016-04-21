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
public class Triangle extends Shape{
  private double height, width;
  

  public Triangle(double height, double width, int numSides) {
      super(numSides);
      this.height = height;
      this.width = width;
  }
  
  @Override
  public double getArea() {
    double A= (this.height * this.width)/2;
    return A;
  }
  
  @Override
  public double getPerimeter() {
    double P = width + (2*((width/2)*(width/2)) + ((height)*(height)));
    return P; 
  }
}
