import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) /*throws IOException*/{
    FileReader fin = nulll;
    
    try {
      fin = new FlieReader("/etc/passwd");
      int c;
      while((c=fin.read()) != -1){
        System.out.print((char)c);
      }
      fin.close();
    } catch (IOException e){ 
        System.out.println("파일 입출력 오류");
    }
  
  }
}
