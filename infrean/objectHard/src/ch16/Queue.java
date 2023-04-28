package ch16;

public interface Queue {

    void enQueue(String title);
    String deQueue();

    int getSize();
}
