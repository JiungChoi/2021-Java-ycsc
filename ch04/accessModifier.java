class Sample{
  public int a;
  private int b;
  int c;
}

public class Main {
  public static void main(String[] args) {
    Sample aClass = new Sample();
    aClass.a = 10;
    aClass.b = 10; // b에의해 컴파일 안 됨
    aClass.c = 10;
    }
}

