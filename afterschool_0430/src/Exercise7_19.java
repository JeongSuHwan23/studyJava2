public class Exercise7_19 {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    b.buy(new Tv());
    b.buy(new Computer());
    b.buy(new Tv());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());

    b.summary();
  }
}

class Buyer {
  int money = 1000;
  Product[] cart = new Product[3];
  int i=0;

  void buy(Product p){
    if (money < p.price) {
      System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다");
      return;
    } else {
      money -= p.price;
      add(p);
    }
  }

  void add(Product p){
    if(i >= cart.length){
      Product[] copyCart = new Product[cart.length * 2];
      System.arraycopy(cart, 0, copyCart, 0, cart.length);
      cart = copyCart;
    }
    cart[i] = p;
    i++;

  }
  void summary(){
    int sum = 0;
    System.out.print("구입한 물건:");
    for(int j=0; j<cart.length; j++){
      System.out.print(cart[j].toString()+",");
      sum += cart[j].price;
    }
    System.out.println();
    System.out.println("사용한 금액 : " + sum);
    System.out.println("남은 금액 : " + money);
  }
}

class Product{
  int price;

  Product(int price){
    this.price = price;
  }
}

class Tv extends Product{
  Tv() { super(100); }
  public String toString() {return "Tv"; }
}

class Computer extends Product{
  Computer() { super(200);}
  public String toString() {return "Computer"; }
}

class Audio extends Product{
  Audio() { super(50); }
  public String toString() {return "Audio"; }
}