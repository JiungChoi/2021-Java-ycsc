import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("스택의 용량을 입력해 주세요. >> ");
    int capacity = sc.nextInt();

    StringStack stack = new StringStack(capacity);
    
    while(true){
      System.out.print("문자열 입력 >> ");
      String src = sc.next();
      
      if (src.equals("그만")) break;
      if (!stack.push(src)){
        System.out.println("스택이 꽉 찼습니다!!");
      }
        
    }

    System.out.print("스택에 저장된 문자열 팝 : ");
    
    int len = stack.length();
    for(int i = 0; i<len; i++){
      System.out.print(stack.pop() + " ");
    }
    System.out.println(" ");
    


    
  }
}



interface Stack {
  int length();
  int capacity();
  String pop();
  boolean push(String val);
}



public class StringStack implements Stack{
  private String[] element;
  private int tos; //top of stack
  
  public StringStack(int capacity){
    element = new String[capacity];
    tos = 0;
  }

  @Override
  public int length(){
    return tos;
  }

  @Override
  public int capacity(){
    return element.length;
  }

  @Override
  public boolean push(String src){
    if(tos == capacity()) 
      return false;
    else{
      element[tos++] = src;
      return true;
    }
  }
  
  @Override
  public String pop(){
    if (tos ==0)
      return null; //Stack Empty
    else
      return element[--tos];
  }
  

}
