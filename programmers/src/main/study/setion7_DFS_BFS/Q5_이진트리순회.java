package main.study.setion7_DFS_BFS;

class Node {
    int data;
    Node2 lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q5_이진트리순회 {
    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt = new Node2(6);
        root.rt.rt = new Node2(7);
        DFS(root);
    }

    public static void DFS(Node2 root) {
        if (root == null) return;
        else {
//            전위순회
            System.out.println(root.data + " ");
            DFS(root.lt);
//            중위 순회
//            System.out.println(root.data + " ");
            DFS(root.rt);
//            후위 순회
//            System.out.println(root.data + " ");
        }
    }
}
