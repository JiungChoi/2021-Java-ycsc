
// FileReader
FileReader fin = new FileReader("c:\\test.txt");

int c;

while((c = fin.read()) != -1){
  System.out.print((char)c);
}

fin.close();


// FileReader 
import java.io.*;

public class FileReaderEx{
  public static void main(String[] args){
    FileReader fin = null;
    try{
      fin = new FileReader("/etc/passwd");
      int c;
      while((c=fin.read()) != -1){
        System.out.print((char)c);
      }
      fin.close();
    }
    catch(IOException e){
      System.out.println("입출력 오류");
    }    
  }
}

// InputStreamReader

FileInputStream fin = new FileInputStream("c:\\Temp\\hangual.txt");
InputStreamReader in = new InputStreamReader(fin, "MS949");

while((c = in.read() != -1)){
  System.out.print((char)c);
}

// InputStreamReader
import java.io.*;

public class FileReaderEx{
  public static void main(String[] args){
    InputStreamReader in = null;
    FileInputStream fin = null;
    
    try{
      fin = new FileInputStream("c:\\Temp\\hangual.txt");
      in = new InputStreamReader(fin, "US-ASCII");
      int c;
      System.out.print("인코딩 문자 집합은" + in.getEncoding());
      while((c = in.read) != -1){
        System.out.print((char)c);
      }
      in.close();
      fin.close();
    } catch(IOEception e){
      System.out.println("입출력 오류");
    } 
  }
}

// FileWriter

FileWriter fout = new FileWriter("c:\\Temp\\test.txt");
fout.writer("A");
fout.close();

// FileWriter

char [] buf = new char[1024];
fout.write(buf, 0, buf.length);

// FileWriter 키보드 입력을 받아서 파일로 저장하는 예제

import java.io.*;
import java.util;

public class FileReaderEx{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    FileWriter fout = null;
    int c;
    try{
      fout = new FileWriter("c:\\Temp\\test.txt");
      while(True){
        String line = scanner.nextLine();
        if(line.length() == 0)
          break;
        fout.write(line, 0, line.length());
        fout.write("\r\n", 0, 2);
      }
      fout.close();
    } catch (IOException e){
      System.out.prinln("입출력 오류");
    }
    scanner.close();
  }
}













