class School {
  int grade;
  int school_class;
  int number;
  String name;

  School(){
    this(2, 2, 14, "정수환");
  }

  School(int grade, int school_class, int number){
    this.grade = grade;
    this.school_class = school_class;
    this.number = number;
    print();
  }

  School(int grade, int school_class, int number, String name){
    this.grade = grade;
    this.school_class = school_class;
    this.number = number;
    this.name = name;
    print();
  }

  void print(){
    System.out.println(grade + "학년 " + school_class + "반 " + number + "번 " + name + "입니다");
  }
}

public class constructorOverloading {
  public static void main(String[] args) {
    School s1 = new School();
    School s2 = new School(2, 2, 2);
    School s3 = new School(2, 3, 6, "김승빈");
  }
}
