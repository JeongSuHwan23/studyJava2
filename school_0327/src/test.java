class Person {
  String name;
  int age;

  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  void print() {
    System.out.println("name : " + this.name + "age : " + this.age);
  }
}

class Student extends Person {
  int studentID;

  Student(String name, int age, int studentID){
    super(name, age);
    this.studentID = studentID;
  }

  @Override
  void print() {
    super.print();
    System.out.println("studentID : " + this.studentID);
  }
}

public class test {
  public static void main(String[] args) {

  }
}
