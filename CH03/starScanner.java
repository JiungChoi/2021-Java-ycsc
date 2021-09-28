import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("정수를 입력하세요. : ");
    
    int num = sc.nextInt();
    
    for(int i = 0 ; i<num ; i++){
      for(int j = 0 ; j< 5-i ; j++ ){
        System.out.print("*");
      }
      System.out.println("");
    }
    sc.close();
  }

}
