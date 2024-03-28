class Publication {
  String title;
  String author;

  // 기본 생성자
  Publication() {
    this("Unknown", "Unknown"); // 다른 생성자 호출
  }

  Publication(String title, String author) {
    this.title = title; // 제목 초기화
    this.author = author; // 저자 초기화
  }

  void displayInfo() {
    System.out.println("제목 : " + title + ", 저자 : " + author); // 정보 출력
  }
}

class Book extends Publication {
  String publicationYear;

  // 기본 생성자
  Book() {
    this("Unknown", "Unknown", "Unknown"); // 다른 생성자 호출
  }

  Book(String title, String author, String publicationYear) {
    super(title, author); // 부모 클래스의 생성자 호출
    this.publicationYear = publicationYear; // 출판년도 초기화
  }

  @Override
  void displayInfo() {
    super.displayInfo(); // 부모 클래스의 displayInfo 메소드 호출
    System.out.println("출판 연도 : " + publicationYear); // 출판년도 출력
  }
}

class RentalInfo {
  Book rentedBook;
  boolean isRented;

  // 기본 생성자
  RentalInfo() {
    this(new Book(), true); // 다른 생성자 호출
  }

  RentalInfo(Book rentedBook) {
    this(rentedBook, true); // 다른 생성자 호출
  }

  RentalInfo(Book rentedBook, boolean isRented) {
    this.rentedBook = rentedBook; // 대여된 도서 설정
    this.isRented = isRented; // 대여 상태 설정
  }

  void toggleRentalStatus() {
    this.isRented = !this.isRented; // 대여 상태 토글
  }

  void displayInfo() {
    rentedBook.displayInfo(); // 대여된 도서의 정보 출력
    System.out.println("대여 상태 : " + (isRented ? "대여됨" : "대여안됨")); // 대여 상태 출력
  }
}

public class test {
  public static void main(String[] args) {
    Book book1 = new Book("자바의 정석", "정수환", "2020");
    RentalInfo rentalInfo1 = new RentalInfo(book1);

    rentalInfo1.displayInfo(); // 대여 정보 출력
    rentalInfo1.toggleRentalStatus(); // 대여 상태 변경
    System.out.println("대여 상태 변경"); // 대여 상태 변경 후
    rentalInfo1.displayInfo(); // 변경된 대여 정보 출력
  }
}
