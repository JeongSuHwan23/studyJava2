class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    boolean b = false;
    for(int i=0; i<10; i++){
      if(i+1==1 || i+1==3 || i+1==8)
        b = true;
      else
        b = false;
      cards[i]=new SutdaCard(i+1, b);
    }
    for(int i=10; i<CARD_NUM; i++){
      cards[i]=new SutdaCard(i-9, b);
    }
  }

  void shuffle() {
    for(int i=0; i<cards.length; i++) {
      int r = (int)(Math.random() * CARD_NUM);
      SutdaCard temp = cards[i];
      cards[i] = cards[r];
      cards[r] = temp;
    }
  }

  SutdaCard pick(int index) {
    return cards[index];
  }


  SutdaCard pick() {
    int index = (int)(Math.random() * CARD_NUM);
    return cards[index];
  }

}

class SutdaCard{
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang){
    this.num = num;
    this.isKwang = isKwang;
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}

public class java7 {
  public static void main(String[] args) {
    SutdaDeck deck = new SutdaDeck();
    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();
    for(int i=0; i<deck.cards.length; i++){
      System.out.print(deck.cards[i] + ", ");
    }
    System.out.println();
    System.out.println(deck.pick(0));
  }
}
