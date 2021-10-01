import java.util.Scanner;

class CurrencyConverter{
  private static double rate; //한국 원화에 대한 달러
  public static double toDollar(double won){
    return won/rate;
  }

  public static double toKWR(double dollar){
    return dollar * rate;
  }

  public static void setRate(double r){
    rate = r;
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("환욜 (1달러) >>");
    double rate= sc.nextDouble();
    CurrencyConverter.setRate(rate);
    System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+ "입니다.");
    System.out.println("$100는"+CurrencyConverter.toKWR(100)+"원 입니다.");
    sc.close();

  }
}
