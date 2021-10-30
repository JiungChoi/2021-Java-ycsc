import java.util.*;

class Main {
  public static void main(String[] args) {
    HashMap<String, Student> studentManagement = new HashMap<>();
    
    studentManagement.put("황기태", new Student(1, "010-1111-2222"));
    studentManagement.put("김기리", new Student(2, "010-1111-4852"));
    studentManagement.put("최지웅", new Student(3, "010-0122-2332"));

    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.print("검색할 사람 이름");
      String name = sc.next();
      if (name.equals("exit")) break;
      Student student = studentManagement.get(name);

      if(student == null) System.out.print("없는 사람 입니다.");
      else System.out.print("id : " + student.id + ", 전화 : "+ student.tel);
    }
  }
}
