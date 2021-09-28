import java.util.InputMismatchException;
import java.util.Scanner;

class Main4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while(true){
        try{
          System.out.print("곱하고자 하는 두 수 입력 >> ");
          int n = sc.nextInt();
          int m = sc.nextInt();
          System.out.print(n +"x" + m + "=" + n*m );
          break;
        }
        catch(InputMismatchException e){
          System.out.println(" 실수는 입력하면 안 됩니다.");
          sc.nextLine();
        }
    }

  sc.close();
  }
}
