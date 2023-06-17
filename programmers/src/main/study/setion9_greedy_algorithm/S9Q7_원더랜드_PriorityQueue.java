package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Point3 implements Comparable<Point3> {
    int nextPoint;
    int cost;

    public Point3(int nextPoint, int cost) {
        this.nextPoint = nextPoint;
        this.cost = cost;
    }

    @Override
    public int compareTo(Point3 ob) {
        return this.cost - ob.cost;
    }
}

public class S9Q7_원더랜드_PriorityQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Point3>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }
        int[] ch = new int[v + 1];
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Point3(b, c));
            graph.get(b).add(new Point3(a, c));
        }

        int answer = 0;
        PriorityQueue<Point3> pQ = new PriorityQueue<>();
        pQ.offer(new Point3(1, 0));

        while (!pQ.isEmpty()) {
            Point3 tmp = pQ.poll();
            int np = tmp.nextPoint;
            if (ch[np] == 0) {
                ch[np] = 1;
                answer += tmp.cost;
                for (Point3 point : graph.get(np)) {
                    if (ch[point.nextPoint] == 0) pQ.offer(new Point3(point.nextPoint, point.cost));
                }
            }
        }
        System.out.println(answer);
    }

}
