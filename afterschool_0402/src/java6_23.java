class Exercise{
  int max(int[] l) {
    if(l == null){
      return -999999;
    }
    int max = -999999;
    for(int i=0; i<l.length; i++){
      if(max<l[i]){
        max = l[i];
      }
    }
    return max;
  }
}

public class java6_23 {
  public static void main(String[] args) {
    int[] data = {3, 2, 9, 4, 7};
    Exercise e = new Exercise();
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("max : " + e.max(data));
    System.out.println("max : " + e.max(null));
    System.out.println("max : " + e.max(new int[] {}));
  }
}
