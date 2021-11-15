import java.io.*;

public class Main{
  public static void main(String[] args){
    InputStreamReader in = null;
    FileInputStream fin = null;
    try{
      fin = new FlieInputStream("test.txt");
      in = new InputStreamReader(fin, "MS949");
      int c ;
      
      System.out.println("인코딩 : " + in.getEncoding());
      while((c = in.read()) != -1){
        Systyem.out.print(/*(char)*/c);
      }
      in.close();
      fin.close();
    } catch(IOException e){
      System.out.println("입출력 오류");
    }
  }
}
