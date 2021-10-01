class staticSample{
  public int n;
  public void g(){
    m = 20;
  }
  public void h(){
    m = 30;
  }
  public static int m;
  public static void f(){
    m = 5;
  }
}

class Main {
  public static void main(String[] args) {
    staticSample s1, s2;
    s1 = new staticSample();
    s1.n = 5;
    s1.g();
    s1.m = 50; //static

    s2 = new staticSample();
    s2.n = 8;
    s2.h();
    s2.f();
    System.out.println(s1.m);
    // static 변수는 공유한다 
  }
}
