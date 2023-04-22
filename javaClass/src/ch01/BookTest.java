package ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author; // toString을 오버라이딩 해서 출력을 변경
    }
}
public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("태백산맥", "조정래");
        System.out.println(book.toString()); // address 가 16진수로 출력됨
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);

        Integer integer = new Integer(100);
        System.out.println(integer);
    }
}
