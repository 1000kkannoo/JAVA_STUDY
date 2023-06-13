package main.study.setion8_DFS_BFS_활용;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_순열_구하기 {
    static int[] answer, arr, ch;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        answer = new int[m];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ch = new int[arr[n - 1] + 1];
        DFS(0);
    }

    private static void DFS(int index) {
        if (index == m) {
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[arr[i]] == 0) {
                    ch[arr[i]] = 1;
                    answer[index] = arr[i];
                    DFS(index + 1);
                    ch[arr[i]] = 0;
                }
            }
        }
    }
}
