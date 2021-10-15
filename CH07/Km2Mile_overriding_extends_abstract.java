class Main {
  public static void main(String[] args) {
    Km2Mile toMile = new Km2Mile(1.6);
    toMile.run();

    Mile2Km toKm = new Mile2Km(0.6);
    toKm.run();
  }
}

import java.util.Scanner;

public abstract class Converter{
  protected double ratio;
  abstract protected double convert(double km);

  abstract protected String km();
  abstract protected String mile();

  public void run() {
    Scanner sc = new Scanner(System.in);
    System.out.println(km() + "를" + mile() +"로 바꿉니다.");
    System.out.print(km() + "를 입력해 주세요. >> ");
    
    double res = convert(sc.nextDouble());
    
    System.out.println("변환 결과 " + res + "["+mile()+"]" + "입니다." );
  }
}

public class Km2Mile extends Converter{
  public Km2Mile(double ratio){
    this.ratio = ratio;
  }

  protected String km(){
    return "Km";
  }

  protected String mile(){
    return "Mile";
  }

  protected double convert(double km){
    return km/ratio ;
  }

}

public class Mile2Km extends Converter{
  public Mile2Km(double ratio){
    this.ratio = ratio;
  }

  protected String mile(){
    return "Mile";
  }

  protected String km(){
    return "km";
  }

  protected double convert(double mile){
    return mile / ratio ;
  }
  
  
}
