import java.io.*;
umport java.util.*;

public class FileWriterEx{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    FileWriter fout = null;
    int c;
    
    try{
      fout = new FlieWriter("PATH");
      while(true){
        String line = sc.nextLine();
        if(line.length() == 0) break;
        fout.write(line, 0, line.length());
        fout.write("\r\n", 0, 2); //윈도우에서는 이렇게 해 줘야함 옛날 타자기
      }
      fout.close();
    } catch(IOException e){
        System.out.println("입출력 오류");
    }
  }
}
