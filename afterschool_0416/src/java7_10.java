class MyTv2{
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 100;

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getChannel(){
    return this.channel;
  }

  public int getVolume(){
    return this.volume;
  }

}

public class java7_10 {
  public static void main(String[] args) {
    MyTv2 t = new MyTv2();

    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setVolume(20);
    System.out.println("VOL:"+t.getVolume());
  }
}
