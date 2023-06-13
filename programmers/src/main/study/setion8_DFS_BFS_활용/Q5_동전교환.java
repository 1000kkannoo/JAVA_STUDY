package main.study.setion8_DFS_BFS_활용;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5_동전교환 {
    static int[] type;
    static int n, change;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        type = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = sc.nextInt();
        }
        change = sc.nextInt();

        int count = BFS(n);
        System.out.println(count);
    }

    private static int BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        int level = 1;
        for (int i = 0; i < n; i++) {
            if (type[i] == change) return level;
            queue.offer(type[i]);
        }
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int poll = queue.poll();
                for (int j = 0; j < n; j++) {
                    int nextValue = poll + type[j];
                    if (nextValue == change) return level + 1;
                    if (nextValue < change) queue.offer(nextValue);
                }
            }
            level++;
        }
        return level;
    }
}
