package main.study.setion8_DFS_BFS_활용;

import java.util.ArrayList;
import java.util.Scanner;

class Practice {
    int score;
    int time;

    public Practice(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Q3_최대점수_구하기 {
    static ArrayList<Practice> practices;
    static int maxScore = 0, m, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        practices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            practices.add(new Practice(score, time));
        }

        DFS(0, 0, 0);
        System.out.println(maxScore);
    }

    private static void DFS(int total, int time, int index) {
        if (time > m) return;
        if (index == n) maxScore = Math.max(maxScore, total);
        else {
            Practice practice = practices.get(index);
            DFS(total + practice.score, time + practice.time, index + 1);
            DFS(total, time, index + 1);
        }
    }
}
