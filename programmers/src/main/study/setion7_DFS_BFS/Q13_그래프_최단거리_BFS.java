package main.study.setion7_DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q13_그래프_최단거리_BFS {
    static int n, m;
    static int[] answer;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        answer = new int[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        BFS2(1);

        for (int i = 2; i < answer.length; i++) {
            System.out.println(i + " : " + answer[i]);
        }
    }

    private static void BFS2(int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                int poll = queue.poll();
                for (int num : graph.get(poll)) {
                    if (answer[num] == 0) {
                        answer[num] = answer[poll] + 1;
                        queue.add(num);
                    }
                }
            }
        }
    }

    private static void BFS(int k) {
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.add(graph.get(k));
        int level = 1;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                ArrayList<Integer> poll = queue.poll();
                for (int num : poll) {
                    if (answer[num] == 0) {
                        answer[num] = level;
                        queue.add(graph.get(num));
                    }
                }
            }
            level++;
        }
    }
}