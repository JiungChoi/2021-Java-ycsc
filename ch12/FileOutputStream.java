// 바이너리 데이터 쓰기

import java.io.*;

public class Main{
  public static void main(String[] args){
    byte b[] = {7, 51, 3, 4, -1, 24};
    try{
      FileOutputStream fout = new FileOutputStream("PATH");
      for(int i = 0 ; i<b.length ; i++) fout.write(b[i]);
      fout.close();
    } catch(IOException e){
        System.out.println("저장 불가 경로명을 확인해 주세요!");
        retrun;
    }
    System.out.println("저장 완료");
  }
}

//바이너리 데이터 읽기

import java.io.*;

public class Main{
  public static void main(String[] args){
    byte b[]  = new byte[6];
    try{
      FileInputStream fin = new FileInputStream("PATH");
      int n = 0, c;
      while((c=fin.read())!= -1){
        b[n] = (byte)c;
        n++;
      }
      System.out.println("PATH 에서 읽은 배열을 출력합니다.");
      for(int i = 0 ; i<b.length ;i++) System.out.print(b[i] + " ");
      System.out.println();
      fin.close();
    } catch(IOException e){
      System.out.println("PATH에서 읽지 못 했습니다.");
    }
  }
}
