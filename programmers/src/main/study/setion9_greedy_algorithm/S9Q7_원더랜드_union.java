package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int point;
    int nextPoint;
    int cost;

    public Point(int point, int nextPoint, int cost) {
        this.point = point;
        this.nextPoint = nextPoint;
        this.cost = cost;
    }

    @Override
    public int compareTo(Point ob) {
        return this.cost - ob.cost;
    }
}

public class S9Q7_원더랜드_union {
    static int[] connect;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        connect = new int[v + 1];
        for (int i = 1; i < connect.length; i++) connect[i] = i;

        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int point = sc.nextInt();
            int nextPoint = sc.nextInt();
            int cost = sc.nextInt();
            points.add(new Point(point, nextPoint, cost));
        }
        Collections.sort(points);

        for (Point point : points) union(point);

        System.out.println(answer);
    }

    private static void union(Point point) {
        int findPoint = find(point.point);
        int findNextPoint = find(point.nextPoint);
        if (findPoint != findNextPoint) {
            connect[findPoint] = findNextPoint;
            answer += point.cost;
        }
    }

    private static int find(int point) {
        if (connect[point] == point) return point;
        else return connect[point] = find(connect[point]);
    }
}
