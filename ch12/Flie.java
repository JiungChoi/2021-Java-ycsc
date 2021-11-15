// 파일의 경로명을 다루는 클래스, 관리 기능

File f = new Flie("/etc/jiung/JI.txt");

String filename = f.getName(); // "JI.txt"
String path = f.getPath(); // "/etc/jiung/JI.txt"
String parent = f.getParent();  // "/etc/jiung/"

if(f.isFile()) // 파일인 경우
if(f.isDirectory()) //디렉터리인 경우

// 서브 디렉터리 리스트 얻기
File f = new Flie("PATH");
File[] subfiles = f.listFiles();

for(int i = 0; i<filenames.length ; i++) {
  System.out.print(subfiles[i].getName()); //파일명 출력
  System.out.println("파일 크기 :" + subfiles[i].length()); //크기 
}


import java.io.*;
umport java.util.*;

public class FileWriterEx{
  public static void main(String[] args){
    
  }
}
