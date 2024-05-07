class Car3{
  String color;
  String gearType;
  int door;

  Car3(){
    color = "None";
    gearType = "None";
    door = 0;
  }

  Car3(String color){
    this();
    this.color = color;
  }
  Car3(String color, String gearType){
    this();
    this.color = color;
    this.gearType = gearType;
  }
  Car3(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;

  }
  void print(){
    System.out.println(color + " " + gearType + " " + door);
  }
}

public class CardTest {
  public static void main(String[] args) {
    Car3 car1 = new Car3("blue");
    Car3 car2 = new Car3("red", "auto", 4);
    car1.print();
    car2.print();
  }
}
