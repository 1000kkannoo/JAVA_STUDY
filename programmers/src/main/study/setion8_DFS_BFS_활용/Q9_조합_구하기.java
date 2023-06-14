package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q9_조합_구하기 {
    static int[] answer;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        DFS(0, 1);
    }

    private static void DFS(int index, int s) {
        if (index == m) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                answer[index] = i;
                DFS(index + 1, i + 1);
            }
        }
    }
}
