package ch20;

import ch18.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("태백산맥1", "조정래"));
        list.add(new Book("태백산맥2", "조정래"));
        list.add(new Book("태백산맥3", "조정래"));
        list.add(new Book("태백산맥4", "조정래"));
        list.add(new Book("태백산맥5", "조정래"));

        /*
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showBookInfo();
        }
        */

        for (Book book : list){
            book.showBookInfo();
        }

    }
}
