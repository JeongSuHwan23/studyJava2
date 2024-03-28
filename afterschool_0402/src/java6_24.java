class Exercise6_24{
  int abs(int n){
    if(n<0){
      return -n;
    }
    else
      return n;
  }
}

public class java6_24 {
  public static void main(String[] args) {
    Exercise6_24 e = new Exercise6_24();
    int  value = 5;
    System.out.println(value+"의 절대값 : " + e.abs(value));
    value = -10;
    System.out.println(value + "의 절대값 : " + e.abs(value));
  }
}
