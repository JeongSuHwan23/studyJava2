class Tv{
  boolean power;
  int channel;

  Tv(){
    power = false;
    channel = 0;
  }

  void power(){
    power = !power;
    System.out.println(power);
  }

  void cup(){
    channel++;
    System.out.println(channel);
  }

  void cdn(){
    channel--;
    System.out.println(channel);
  }
}

class Caption extends Tv{
  boolean caption;

  Caption(){
    caption = false;
  }

  void display(String text){
    System.out.println(text);
    System.out.println(caption);
  }
}



public class ctv {
  public static void main(String[] args) {
    Caption c = new Caption();
    c.power();
    c.cup();
    c.cdn();
    c.display("a");
  }
}
