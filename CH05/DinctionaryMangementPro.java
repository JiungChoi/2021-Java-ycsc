import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("한영 단어 검색");

    while(true){
      System.out.print("한글 단어 : ");
      String kor = sc.next();

      if (kor.equals("그만")) break;
      
      String eng = Dictionary.kor2Eng(kor);

      if (eng == null)
        System.out.println(kor + "는 사전에 없습니다.");
      else
        System.out.println(kor + "는" + eng + "입니다.");
    }
    System.out.println("종료합니다.");
  }
}


public class Dictionary{
  private static String[] kor = {"사랑", "아기", "던", "미래", "희망" };

  private static String[] eng = {"love", "baby", "money", "future", "hope" };
  void Dictionary(){
    
  }

  public static String kor2Eng(String word){
    for(int i = 0 ; i<kor.length ; i++){
      if(kor[i].equals(word))
        return eng[i];
    }
    return null;
  }

  
}
