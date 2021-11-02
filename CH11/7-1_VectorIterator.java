import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;


class Main {
  public static void print(Vector<Integer> v){
    Iterator<Integer> it = v.iterator();
    int sum = 0;

    while(it.hasNext()){
      int n = it.next();
      sum += n;
    }
    int avr = sum / (v.size());
    System.out.print(avr);
  }

  public static void main(String[] args) {
    Vector<Integer> v = new Vector<>();
    Scanner sc = new Scanner(System.in);

    int value;
    while(true){
      System.out.print("강수량 입력(0: 종료): ");
      value = sc.nextInt();
      
      if (value == 0) break;
      v.add(value);
    }

    print(v);    
  }
}
