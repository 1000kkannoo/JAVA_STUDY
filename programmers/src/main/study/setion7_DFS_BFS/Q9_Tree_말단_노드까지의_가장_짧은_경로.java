package main.study.setion7_DFS_BFS;

class Node3 {
    int data;
    Node3 lt, rt;

    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q9_Tree_말단_노드까지의_가장_짧은_경로 {
    static int max = Integer.MAX_VALUE;
    static int count = 0;

    public static void main(String[] args) {
        Node3 root = new Node3(1);
        root.lt = new Node3(2);
        root.rt = new Node3(3);
        root.lt.lt = new Node3(4);
        root.lt.rt = new Node3(5);
        int n = DFS2(root, 0);
        System.out.println(n);
    }

    private static int DFS2(Node3 root, int count) {
        if (root.lt == null && root.rt == null) return count;
        else return Math.min(DFS2(root.lt, count + 1), DFS2(root.rt, count + 1));
    }

    private static void DFS(Node3 root) {
        if (root.lt == null && root.rt == null) {
            max = Math.min(max, count);
        } else {
            count++;
            DFS(root.lt);
            DFS(root.rt);
            count--;
        }
    }
}
