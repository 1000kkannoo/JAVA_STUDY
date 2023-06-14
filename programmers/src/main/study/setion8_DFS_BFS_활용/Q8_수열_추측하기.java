package main.study.setion8_DFS_BFS_활용;

import java.util.Scanner;

public class Q8_수열_추측하기 {
    static int answerIndex = 0, index = 0;
    static int[] answer;
    static int[] sum = new int[2];
    static int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        answer = new int[n];
        System.out.println(DFS2(f - 1, 2));
    }

    private static int DFS2(int f, int r) {
        if (dy[f][r] > 0) return dy[f][r];
        if (r == 0 || f == r) {
            int total = 0;
            for (int num : sum) {
                total += num;
            }
            return total;
        } else {
            sum[index] = f;
            index++;
            int lt = DFS2(f - 1, r - 1);
            index--;
            int rt = DFS2(f - 1, r);
            dy[f][r] = lt + rt;
            return dy[f][r] = DFS2(f - 1, r - 1) + DFS2(f - 1, r);
        }
    }

    private static void DFS(int n, int r) {
        if (r == 0 || n == r) answer += 1;
        else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
        }
    }
}
