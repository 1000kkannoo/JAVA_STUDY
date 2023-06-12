package main.study.setion7_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q7_이진트리순회_BFS {
    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt = new Node2(6);
        root.rt.rt = new Node2(7);
        BFS(root);
    }

    private static void BFS(Node2 root) {
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node2 poll = queue.poll();
                System.out.print(poll.data + " ");
                if (poll.lt != null) queue.offer(poll.lt);
                if (poll.rt != null) queue.offer(poll.rt);
            }
            L++;
            System.out.println();
        }
    }
}
