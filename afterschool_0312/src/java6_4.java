public class java6_4 {
  public static void main(String[] args) {
    Student s = new Student();
    s.name = "JSH";
    s.ban = 2;
    s.no = 14;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;

    System.out.println("이름:"+s.name);
    System.out.println("총점:"+s.getTotal());
    System.out.println("평균:"+s.getAverage());
  }
}

class Student{
  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  int getTotal(){
    return (this.eng + this.kor + this.math);
  }

  double getAverage(){
    return ((this.eng + this.kor + this.math)/3.0);
  }
}