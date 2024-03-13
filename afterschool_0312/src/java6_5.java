public class java6_5 {
  public static void main(String[] args) {
    Student_1 s = new Student_1("홍길동", 2, 2, 100, 60, 76);
    System.out.println(s.info());
  }
}

class Student_1{
  String name;
  int grade;
  int ban;
  int kor;
  int eng;
  int math;
  int sum;
  double avg;

  Student_1(String name, int ban, int no, int kor, int eng, int math){
    this.name = name;
    this.grade = ban;
    this.ban = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = kor + eng + math;
    this.avg = (double) (this.sum)/3;
  }

  String info(){
    return this.name + ',' + this.grade + ',' + this.ban + "," + this.kor + "," + this.eng + "," + this.math + "," + this.sum + "," + this.avg;
  }
}




