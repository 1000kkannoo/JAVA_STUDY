package main.study.setion9_greedy_algorithm;

import java.util.Scanner;

public class S9Q6_친구인가_union {
    static int[] friend;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        friend = new int[n + 1];
        for (int i = 1; i <= n; i++) friend[i] = i;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        int c = sc.nextInt();
        int d = sc.nextInt();
        int findC = find(c);
        int findD = find(d);

        System.out.println((findC == findD) ? "YES" : "NO");
    }

    private static void union(int a, int b) {
        int f1 = find(a);
        int f2 = find(b);
        if (f1 != f2) friend[f1] = f2;
    }

    private static int find(int val) {
        if (val == friend[val]) return val;
        else return friend[val] = find(friend[val]);
    }
}
