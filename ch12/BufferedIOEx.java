import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    FileReader fin = null;
    int c;
    try{
      fin = new FileReader("PATH");
      BufferedOutputStream(System.out, 5);
      while((c=fin.read()) != -1) out.write(c);
      
      new Scanner(System.in).nextLine(); // Enter 키 기다림
      out.flush(); //버퍼에 남아 있던 문자 모두 출력
      fin.close();
      out.close();
    } catch (IOException e){
        e.printStackTrace(); // ?
    }
    
  }
}
