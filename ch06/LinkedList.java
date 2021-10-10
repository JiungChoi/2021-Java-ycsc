class Main {
  static void paint(Shape p){
    while(p != null){
      p.draw();
      p = p.next;
    }
  }

  public static void main(String[] args) {
    Shape start, last, obj;
    
    start = new Line();
    last = start;
    obj = new Rect();
    last.next = obj;
    last = obj;
    obj = new Line();
    last.next = obj;
    last = obj;
    obj = new Circle();
    last.next = obj;
    
    paint(start);
  }
}


public class Shape{
  public Shape next;
  public Shape(){next = null ;}

  public void draw(){
    System.out.println("Shape");
  }
}

public class Rect extends Shape{
  public void draw(){
    System.out.print("Rect");
  }
}

public class Line extends Shape{
  public void draw(){
    System.out.print("Line");
  }
}

public class Circle extends Shape{
  public void draw(){
    System.out.print("Circle");
  }
}
