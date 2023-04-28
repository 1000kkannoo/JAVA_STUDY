package ch18;

public class ObjectCopy {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // 얕은 복사
        // 두 객체의 주소값은 다르지만, 복사되는 객체가 복사하는 대상의 주소를
        // 가리킨다고 이해를 하면 된다, 즉 복사를 당하는 객체의 값에 변화가 생기면
        // 복사 되는 객체도 똑같이 값이 변화됨
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===============");

        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===============");

        for(Book book : copyLibrary) {
            book.showBookInfo();
        }

        System.out.println(library.toString() + "/" + copyLibrary.toString());
    }
}
