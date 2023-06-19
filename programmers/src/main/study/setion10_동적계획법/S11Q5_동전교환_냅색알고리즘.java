package main.study.setion10_동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class S11Q5_동전교환_냅색알고리즘 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
            type[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m + 1];
        System.out.println(solution(n, m, type));
    }

    private static int solution(int n, int m, int[] type) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = type[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - type[i]] + 1);
            }
        }
        return dy[m];
    }
}
