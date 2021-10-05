import java.util.Scanner;

public class MonthSchedule{
  private int nDays;
  private Day[] days;

  public MonthSchedule(int nDays){
    this.nDays = nDays;
    days = new Day[nDays];
  }

  public void run(){
    System.out.println("이번달 스케줄 관리 프로그램");

    Scanner sc = new Scanner(System.in);
  

    while(true){
      System.out.print("할 일 (입력:1, 보기:2, 끝내기:3) >>");
      int menu = sc.nextInt();

      switch(menu) {
        case 1:
          input();
          break;
        case 2:
          view();
          break;
        case 3:
          System.out.print("종료합니다.");
          break;
        default:
          System.out.print("다시 입력하세요.");
      }    
    }

  }

  public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("날짜 (1~"+nDays+") >> ");
    int when = sc.nextInt();

    System.out.print("할 일 >> ");
    String what = sc.nextLine();

    if(when >= 1 && when <= nDays){
      days[when-1] = new Day();
      days[when-1].setWork(what);
    }
    else {
      System.out.println("날짜를 잘못 입력하셨습니다.");
    }
   
  }

  public void view(){
    Scanner sc = new Scanner(System.in);
    System.out.print("날짜 (1~"+nDays+") >> ");
    int when = sc.nextInt();

    if(days[when-1] != null && when >= 1 && when <= nDays){
      System.out.print(when+"일의 할 일은");
      days[when-1].show();
    }
    else {
      System.out.println("날짜를 잘못 입력하셨습니다.");
    }
  }


}

