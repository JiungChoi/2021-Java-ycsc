import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("x좌표 y좌표를 입력해 주세요: ");
    
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    if (((x>=100) && (x <=200)) && ((y>=100) && (y <=200)))
      System.out.print("상자 안에 있습니다.");
    else
      System.out.print("상자 안에 없습니다.");
      


  }
}
