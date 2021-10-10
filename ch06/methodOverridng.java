class Main {
  static void paint(Shape p){
    p.draw();
  }

  public static void main(String[] args) {
    Line line= new Line();
    paint(line);
    paint(new Shape());
    paint(new Line());
    paint(new Rect());
    paint(new Circle());
  }
}

public class Shape{
  public Shape next;
  public Shape(){next = null ;}

  public void draw(){
    System.out.println("Shape");
  }
}

public class Circle extends Shape{
  public void draw(){
    System.out.print("Circle");
  }
}

public class Line extends Shape{
  public void draw(){
    System.out.print("Line");
  }
}

public class Rect extends Shape{
  public void draw(){
    System.out.print("Rect");
  }
}
