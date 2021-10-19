import java.util.Calendar;

class Main {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();

    

    if (now.get(Calendar.AM_PM) == 0) { // 오전 0 오후 1
      System.out.println("현재 시간은 오전" + now.get(Calendar.HOUR) +"시"+ now.get(Calendar.MINUTE) +"분"+ now.get(Calendar.SECOND) +"초 입니다." );
      if ( (now.get(Calendar.HOUR) <= 12) && (now.get(Calendar.HOUR) > 4) ){
        System.out.println("Good Morning");
      }
    }
    else {
      if ( now.get(Calendar.HOUR) <= 9 ){
        System.out.println("Good Evening");
      }
      else {
         System.out.println("GoodNight");
      }
    }
  }
}
