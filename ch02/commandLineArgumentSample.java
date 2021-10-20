class Main {
  public static void main(String[] args) {
    double sum = 0.0;
    for(int i = 0; i<args.length ; i++){
      try{
        sum += Double.parseDouble(args[i]);
      }catch(NumberFormatException e) {
        continue;
      }
    }
    
    System.out.print("합계 : " +  sum);
  }
}
