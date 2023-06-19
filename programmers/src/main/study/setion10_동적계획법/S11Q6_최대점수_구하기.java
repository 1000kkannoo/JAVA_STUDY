package main.study.setion10_동적계획법;

import java.util.Scanner;

public class S11Q6_최대점수_구하기 {
    static int[] scores;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            for (int j = m; j >= time; j--) {
                dy[j] = Math.max(dy[j], score + dy[j - time]);
            }
        }
        System.out.println(dy[m]);
    }
}
