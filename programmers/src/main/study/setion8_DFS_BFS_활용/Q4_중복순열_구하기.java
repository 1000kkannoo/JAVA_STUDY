package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q4_중복순열_구하기 {
    static int[] answer;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        answer = new int[m];

        DFS(0);
    }

    private static void DFS(int k) {
        if (k == answer.length) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                answer[k] = i;
                DFS(k + 1);
            }
        }
    }
}
