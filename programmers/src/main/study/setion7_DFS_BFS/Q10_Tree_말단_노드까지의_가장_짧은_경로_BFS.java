package main.study.setion7_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 lt, rt;

    public Node4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q10_Tree_말단_노드까지의_가장_짧은_경로_BFS {
    public static void main(String[] args) {
        Node4 root = new Node4(1);
        root.lt = new Node4(2);
        root.rt = new Node4(3);
        root.lt.lt = new Node4(4);
        root.lt.rt = new Node4(5);

        System.out.println(BFS(root));
    }

    private static int BFS(Node4 root) {
        Queue<Node4> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node4 poll = queue.poll();
                if (poll.lt == null && poll.rt == null) return level;
                if (poll.lt != null) queue.offer(poll.lt);
                if (poll.lt != null) queue.offer(poll.rt);
            }
            level++;
        }
        return level;
    }
}
