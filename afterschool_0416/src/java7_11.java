class MyTv{
  boolean isPowerOn;
  int channel;
  int volume;
  int last_Channel;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 100;

  public void setChannel(int channel) {
    last_Channel = this.channel;
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

  public void gotoPrevChannel(){
    int temp;
    temp = last_Channel;
    last_Channel = channel;
    channel = temp;
  }
}

public class java7_11 {
  public static void main(String[] args) {
    MyTv t = new MyTv();

    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());
  }
}
