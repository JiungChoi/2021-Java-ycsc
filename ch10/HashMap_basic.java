import java.util.*;

class Main {
  public static void main(String[] args) {
    HashMap<String, String> dic = new HashMap<>();

    dic.put("baby", "아기");
    dic.put("love", "사랑");
    dic.put("apple", "사과");

    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("찾고 싶은 단어는 ?");
      String word = sc.next();
      if(word.equals("exit")) {
        System.out.print("종료");
        break;
      }

      String kor = dic.get(word);
      if(kor == null) System.out.print("없는 단어 입니다."));
      else System.out.print(kor);
    }
    
    
  }
}
