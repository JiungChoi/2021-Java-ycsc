public class DoWhileSample {
  public static void main(String[] args){
    char alphabet = 'a';

    do{
      System.out.print(alphabet + " ");
      alphabet = (char)(alphabet + 1);
      
    }while(alphabet <= 'z');
  }
}
