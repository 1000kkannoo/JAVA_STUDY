package ch7_DFS_BFS;

import java.util.Scanner;

public class 팩토리얼 {
    static int sum = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
        System.out.println(sum);
    }

    private static void DFS(int n) {
        if (n != 1) {
            sum *= n;
            DFS(n - 1);
        }
    }
}
