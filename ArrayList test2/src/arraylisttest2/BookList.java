package arraylisttest2;

public class BookList {
    public static void main(String[] args) {
        Library lib = new Library();

        Book[] books = new Book[5];
        books[0] = new Book("이것이 자바다", "홍길동", 500);
        books[1] = new Book("자료구조와 알고리즘", "김영희", 1200);
        books[2] = new Book("객체 지향 디자인", "박철수", 800);
        books[3] = new Book("클린 코드", "로버트 마틴", 1000);
        books[4] = new Book("Head First Java", "Kathy Sierra", 750);

        for (int i = 0; i < 5; i++) {
            lib.addbooktitle(books[i].title);
            lib.addbookauthor(books[i].author);
            lib.addbookfee(books[i].fee);

            System.out.println("도서 등록 완료: " + lib.booktitle.get(i));
        }
        System.out.println();
        System.out.println("====== 등록된 도서 목록 (5권) ======");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". 제목: " + lib.booktitle.get(i) + ", 저자: " + lib.bookauthor.get(i) + ", 대여료: "
                    + lib.bookfee.get(i) + "원");
        }

        System.out.println("=========================================");

    }

}
