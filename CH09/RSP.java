import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Game game = new Game();
    // game.run();

    Computer com1 = new Computer("컴퓨터1");
    Computer com2 = new Computer("컴퓨터2");

    Game game = new Game(com1, com2);
    game.run();
  }
}

########################### Player.java

import java.util.Scanner;

public class Player{
  private String name;
  private final String[] s = {"가위", "바위", "보"};
  protected int select;

  public Player(String name){
    this.name = name;
  }

  public String getName() { return name; }
  public String getString(){ return s[select-1]; }
  public int turn() {
    Scanner sc = new Scanner(System.in);
    
    while(true){
      System.out.print(name + "[가위:1 바위:2 보:3 종료:4] >> ");
      try{
        select = sc.nextInt();
      } catch(Exception e){ continue; }

      if(select<1 || select>4) continue;
      return select;
    }
  }
}





########################### Computer.java
public class Computer extends Player{
  public Computer(String name){
    super(name);
  }

  @Override
  public int turn(){
    // 난수 1~3
    select = (int)(Math.random()*3 +1);
    return select;
  }
}


########################### Game.java

public class Game {
  private Player[] players = new Player[2];
  
  public Game(){
    players[0] = new Player("철수");
    players[1] = new Computer("컴퓨터");
  }
  public Game(Player player1, Player player2){
    players[0] = player1;
    players[1] = player2;
  }

  public void run(){
    int player1, player2;

    while (true) {
      player1 = players[0].turn();
      player2 = players[1].turn();

      if(player1 == 4 || player2 ==4) break;

      int res = player1 - player2;
      System.out.println(players[0].getName() + ":" + players[0].getString() + "," +players[1].getName() + ":" + players[1].getString() );

      if (res == 0) { System.out.println("비겼습니다!");}
      else if(res == -1 || res == 2){ System.out.println(players[0].getName() +"이 이겼습니다!");}
      else { System.out.println(players[1].getName() +"이 이겼습니다!"); }

      
    }
    
  }
}

