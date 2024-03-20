class Certificate {
  void print(String name, String ...type){
    System.out.print(name+" ");
    for (String types : type) {
      System.out.print(types+" ");
    }
  }
}

public class methodOverloading {
  public static void main(String[] args) {
    Certificate c = new Certificate();
      c.print("정수환", "AZ900", "정처산기");
      c.print("강시우", "컴활");
  }
}
