import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
    Grade me = new Grade();
    me.math = sc.nextInt();
    me.science = sc.nextInt();
    me.english = sc.nextInt();

    System.out.println("평균은" +  me.average());

    sc.close();
  }
}

class Grade{
  static int math;
  static int science;
  static int english;

  public static double average(){
   return (math + science + english)/3. ;
 }
}
