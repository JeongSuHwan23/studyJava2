package school_0501.src;

abstract class Ability{
  abstract boolean hitting();
}

class Player extends Ability{
  double avg;

  Player(double avg){
    this.avg =  avg;
  }

  boolean hitting() {
    double hit = Math.random();
    return avg > hit;
  };
}

public class Baseball {
  public static void main(String[] args) {
    Player LeeDH = new Player(0.3);
    Player LeeJH = new Player(0.45);
    Player KimHS = new Player(0.28);
   if(LeeDH.hitting()) System.out.println("hit");
   else System.out.println("Out");
   if(LeeJH.hitting()) System.out.println("hit");
   else System.out.println("Out");
   if(KimHS.hitting()) System.out.println("hit");
   else System.out.println("Out");
  }
}
