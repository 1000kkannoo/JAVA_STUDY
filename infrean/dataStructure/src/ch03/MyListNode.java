package ch03;

public class MyListNode {

    private String data;
    public MyListNode next; // link

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData(){
        return data;
    }
}
