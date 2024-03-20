class MyTv {
  boolean isPowerON;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  void turnOnOff() {
    isPowerON = !isPowerON;
  }

  void volumeUp() {
    if(volume < MAX_VOLUME) {
      volume += 1;
    }
  }

  void volumeDown() {
    if(volume > MIN_VOLUME) {
      volume -= 1;
    }
  }

  void channelUp() {
    channel += 1;
    if(channel == 1 + MAX_CHANNEL) {
      channel = MIN_CHANNEL;
    }
  }

  void channelDown() {
    channel -= 1;
    if (channel == MIN_CHANNEL - 1) {
      channel = MAX_CHANNEL;
    }
  }
}

public class java6_21 {

  public static void main(String[] args) {
    MyTv t = new MyTv();

    t.channel = 100;
    t.volume = 0;
    System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

    t.channelDown();;
    t.volumeDown();
    System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

    t.volume = 100;
    t.channelUp();;
    t.volumeUp();
    System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
  }
}
