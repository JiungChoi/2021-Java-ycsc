class Main {
  
  public static void main(String [] args){
    Point A = new Point(2, 3);
    Point B = new Point(2, 3);
    Point C = new Point(5, 4);

    if(A == B) System.out.println("a == b");
    if(A.equals(B)) System.out.println("a is equal to b");
    if(A.equals(C)) System.out.println("a is equal to c");
  }


}

public class Point{
  private int x, y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  // ObJ에서 오버라이딩 한게 아니고 Point 타입의 매개변수로 오버로딩한 것 뿐임
  /*public boolean equals(Point in){
    if(x == in.x && y == in.y) return true;
    else return false;
  }*/

  //Override
  public boolean equals(Object obj){
    Point in = (Point)obj;
    if(x == in.x && y == in.y) return true;
    else return false;
  }  
}

