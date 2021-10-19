// Main.java ############################

package app;
import derived.Circle;
import base.Shape;

class Main {
  public static void main(String[] args) {
    Shape shape = new Circle();
    shape.draw();
  }
}


// Circle.java ############################
package derived;
import base.Shape;

public class Circle extends Shape{
  public void draw() { System.out.println("Circle"); }
}

// Shape.java ############################

package base;

public class Shape{
  public void draw() { System.out.println("Shape"); }
}


