interface Pitcher {
  void pitch();
}

interface Batter {

  void hit();
}

class BaseballPitcher implements Pitcher {
  int speed = 150;
  public void pitch() {
    System.out.println("공을 던집니다.");
  }
}

class BaseballBatter implements Batter {
  double avg = 0.3;
  public void hit() {
    System.out.println("공을 칩니다.");
  }
}

class BaseballGame {
  public static void main(String[] args) {
    Pitcher pitcher = new BaseballPitcher();
    Batter batter = new BaseballBatter();

    pitcher.pitch();
    batter.hit();

  }
}
