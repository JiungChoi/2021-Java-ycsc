import java.util.Scanner;

public class SeasonFunc{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("몇 월 인가요?");

    int month = sc.nextInt();
    
    switch((month)/3){
      case 1:
        System.out.print("봄 입니다." );
        break;
      case 2:
        System.out.print("여름입니다.");
        break;
      case 3:
        System.out.print("가을 입니다." );
        break;
      case 0:
        System.out.print("겨울 입니다." );
        break;  
      default:
        System.out.print("잘못 입력하셨습니다.");
    }
      
    sc.close();
    
  
  }
}
