package ch05;

import ch03.MyListNode;

public class MyListQueueTest {

    public static void main(String[] args) {
        MyListQueue listQueue = new MyListQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("A");
        listQueue.enQueue("A");
        listQueue.enQueue("A");
        listQueue.enQueue("A");
        listQueue.printAll();

        System.out.println("===============");

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());

        listQueue.printAll();
    }
}
