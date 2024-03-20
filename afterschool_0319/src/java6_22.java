public class java6_22 {
  static boolean isNumber(String str){
    for (int i=0; i<str.length(); i++){
      if((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "123";
    System.out.println(str.length());
    System.out.println(str+"는 숫자입니까? " + isNumber(str));

    str = "1234o";
    System.out.println(str+"는 숫자입니까? " + isNumber(str));
  }
}
