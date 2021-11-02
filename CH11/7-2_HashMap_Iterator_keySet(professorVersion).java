class Main {
  public static void main(String[] args) {
    LocationManager prog = new LocationManager();
    prog.run();
  }
}

// @@@@@@@@@@@@Location.java@@@@@@@@@@@

public class Location{
  private String name;
  private double longitude;
  private double latitude;

  public Location(String name, double longitude, double latitude){
    this.name = name;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  @Override
  public String toString(){
    return name + "," + longitude +","+ latitude ;
  }

}

// @@@@@@@@@@@@@@@LocationManager.java@@@@@@@@@@@@@@@@

import java.util.*;

public class LocationManager{
  private HashMap<String, Location> dept = new HashMap<String, Location>();
  private Scanner sc = new Scanner(System.in);
  private void read(){
    System.out.println("도시 이름, 경도, 위도를 입력하세요. ");

    for(int i = 0 ; i<4 ; i++){
      System.out.print(">> ");
      String inputText = sc.nextLine();
      StringTokenizer st = new StringTokenizer(inputText, ",");
      String name = st.nextToken().trim();
      double longitude = Double.parseDouble(st.nextToken().trim());
      double latitude = Double.parseDouble(st.nextToken().trim());
      
      Location loc = new Location(name, longitude, latitude);
      dept.put(name, loc);
    }
  }
  
  private void printAll(){
    Set<String> keys = dept.keySet();

    Iterator<String> it = keys.iterator();
    System.out.println("--------------");

    while(it.hasNext()){
      String name = it.next();
      Location loc = dept.get(name);
      System.out.println(loc);
    }

    System.out.println("-------------");

  }

  private void processQuery(){
    while(true){
      System.out.print("도시 이름 >>");
      String name = sc.nextLine();
      if(name.equals("그만")) break;

      Location loc = dept.get(name);

      if(loc == null) System.out.print("도시가 없습니다.");
      else System.out.print(loc);
    }
  }

  public void run(){
    read();
    printAll();
    processQuery();
  }
}
