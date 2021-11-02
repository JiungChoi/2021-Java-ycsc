import java.util.*;

class Location{
  public String wido;
  public String gyungdo;

  public Location(String gyungdo, String wido){
    this.gyungdo = gyungdo;
    this.wido = wido;
  }
}

class Main {
  public static void main(String[] args) {
    HashMap<String, Location> city = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("도시,경도,위도를 입력해 주세요.(4개)");
    for(int n=0; n<4 ; n++){
      String[] cityInfo = sc.next().split(",");
      city.put(cityInfo[0], new Location(cityInfo[1], cityInfo[2]));
    }
    
    Set<String> keys = city.keySet();
    Iterator<String> it = keys.iterator();

    while(it.hasNext()){
      String name = it.next();
      System.out.println(name + " " + city.get(name).gyungdo + " " + city.get(name).wido);
    }

    while(true){
      System.out.println("검색할 도시 이름");
      String name = sc.next();

      if(name.equals("exit")) break;
      Location findCity = city.get(name);

      if(findCity == null) System.out.println("없는 도시 입니다.");
      else System.out.println("경도 : "+findCity.gyungdo+"위도: "+findCity.wido);
      
    }


  }
}
