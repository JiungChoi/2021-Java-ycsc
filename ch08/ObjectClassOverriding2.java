class Main {
  public static void main(String[] args) {
    Rect a = new Rect(4, 5);
    Rect b = new Rect(2, 10);
    
    if(a.equals(b)) System.out.println("a is equal to b");
  }
}

public class Rect{
  private int width;
  private int height;
  public Rect(int width, int height){
    this.width = width;
    this.height = height;
  }
  @Override
  public boolean equals(Object obj){
    Rect p = (Rect)obj;
    if (width*height == p.width*p.height) return true;
    else return false;
  }

}
