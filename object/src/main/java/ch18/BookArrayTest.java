package ch18;

public class BookArrayTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("태백산맥1", " 조정래");
        library[1] = new Book("태백산맥2", " 조정래");
        library[2] = new Book("태백산맥3", " 조정래");
        library[3] = new Book("태백산맥4", " 조정래");
        library[4] = new Book("태백산맥5", " 조정래");

        for(Book book : library) {
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
