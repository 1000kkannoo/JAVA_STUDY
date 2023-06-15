package main.study.setion8_DFS_BFS_활용;

import java.util.ArrayList;
import java.util.Scanner;

class Point3 {
    int x;
    int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q14_피자_배달_거리 {
    static int n, m, length, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point3> pizza, houses;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        pizza = new ArrayList<>();
        houses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) houses.add(new Point3(i, j));
                else if (tmp == 2) pizza.add(new Point3(i, j));
            }
        }
        length = pizza.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }

    private static void DFS(int level, int s) {
        if (level == m) {
            int sum = 0;
            for (Point3 house : houses) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis,
                            Math.abs(house.x - pizza.get(i).x) + Math.abs(house.y - pizza.get(i).y)
                    );
                }
                sum += dis;
            }
            // 도시의 피자 배달거리
            answer = Math.min(answer,sum);
        } else {
            for (int i = s; i < length; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }
}
