//class SutdaDeck {
//  final int CARD_NUM = 20;
//  SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//  SutdaDeck() {
//    boolean b = false;
//    for(int i=0; i<10; i++){
//        if(i+1==1 || i+1==3 || i+1==8)
//          b = true;
//        else
//          b = false;
//        cards[i]=new SutdaCard(i+1, b);
//    }
//    for(int i=10; i<CARD_NUM; i++){
//      cards[i]=new SutdaCard(i-9, b);
//    }
//  }
//}
//
//class SutdaCard{
//  int num;
//  boolean isKwang;
//
//  SutdaCard() {
//    this(1, true);
//  }
//
//  SutdaCard(int num, boolean isKwang){
//    this.num = num;
//    this.isKwang = isKwang;
//  }
//
//  public String toString() {
//    return num + (isKwang ? "K" : "");
//  }
//}
//
//public class java7_1 {
//  public static void main(String[] args) {
//    SutdaDeck deck = new SutdaDeck();
//    for(int i=0; i<deck.cards.length; i++){
//      System.out.print(deck.cards[i] + ", ");
//    }
//  }
//}
