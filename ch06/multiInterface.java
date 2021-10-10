interface PhoneInterface{
  final int TIMEOUT = 10000;
  void sendCall();
  void receiveCall();
  default void printLogo(){
    System.out.println("** Phone **");
  }
}

interface AIInterface{
  void recognizeSpeech();
  void synthesizeSpeech();
}

class SamsungPhone implements PhoneInterface, AIInterface{
  public void sendCall(){
    System.out.println("띠리리리링");
  }

  public void receiveCall(){
    System.out.println("전화가 왔습니다.");
  }

  public void recognizeSpeech(){
    System.out.println("목소리목소리");
  }

  public void synthesizeSpeech(){
    System.out.println("목목소소리리");
  }

  public void flash(){ System.out.println("전화기에 불이 켜졌습니다.");}
  
}


class Main {
  public static void main(String[] args) {
    SamsungPhone phone = new SamsungPhone();
    phone.printLogo();
    phone.sendCall();
    phone.receiveCall();
    phone.recognizeSpeech();
    phone.synthesizeSpeech();
    phone.flash();   
  }
}
