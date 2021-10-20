
import java.util.Scanner;

class Main2{
  public static void main(String[] args){
    int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    int[] coins = {0, 0, 0, 0, 0, 0, 0, 0};


    Scanner sc = new Scanner(System.in);
    System.out.println(" 금액을 입력하세요: ");

    int coin = sc.nextInt();
    
    for(int i = 0; i<unit.length; i++){
      if (coin/unit[i] > 0){
        coins[i] = (coin/unit[i]);
        coin -= unit[i] * (coin/unit[i]);

      }
    }

    for(int i = 0 ; i<unit.length ;i++)
      System.out.println(unit[i] + "원 짜리 : " + coins[i] + "개");
  }
}
