package ch18;

public class Book {

    private String title;
    private String author;

    public Book() {
        this.title = "기본책입니다.";
        this.author = "기본이름입니다.";
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(author + "," + title);
    }
}
