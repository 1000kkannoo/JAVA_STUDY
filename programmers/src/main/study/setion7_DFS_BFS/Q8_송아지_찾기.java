package main.study.setion7_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_송아지_찾기 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Q8_송아지_찾기 T = new Q8_송아지_찾기();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }

    private int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int level = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int poll = queue.poll();
                for (int num : dis) {
                    int nx = poll + num;
                    if (nx == e) return level + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        queue.offer(nx);
                        ch[nx] = 1;
                    }
                }
            }
            level++;
        }
        return answer;
    }
}
