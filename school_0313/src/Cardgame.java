class Card{
  int number;
  char name;
  static int cardNumber = 20;

  int cardChoice() {
    number = (int) (Math.random() * 10) + 1;
    cardNumber--;
    return number;
  }

  Card copy(Card c){
    Card tmp = new Card();
    tmp.number = c.number;
    return tmp;
  }
}

public class Cardgame {
  public static void main(String[] args) {
    Card[] c = new Card[3];

    int max = 0;
    int[] cardArray = new int[3];

    for(int i=0; i<c.length; i++){
      Card temp = new Card();
      c[i] = temp.copy(temp);
      cardArray[i] = c[i].cardChoice();
      if (cardArray[i] > max) {
        max = cardArray[i];
      }
      System.out.println(i+1 + "의 카드는 " + cardArray[i]);
    }

    System.out.print("승자는 ");

    for(int i=0; i<3; i++){
      if(cardArray[i] == max){
        System.out.print(i+1 + "번 ");
      }
    }
    System.out.println("입니다");
    System.out.println("카드가 " + Card.cardNumber +  "개 남았습니다");

  }
}
