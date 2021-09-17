import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 3개를 입력해 주세요.");

    int a, b, c;

    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    int med;

    if ( (a >= b && a<=c) || (a >= c && a<=b) ) 
      med = a;
    else if ( (b >= a && b<=c) || (b >= c && a<=a) )
      med = b;
    else
      med = c;


    System.out.print("중간값은" + med);
    scanner.close();

    
  }
}
