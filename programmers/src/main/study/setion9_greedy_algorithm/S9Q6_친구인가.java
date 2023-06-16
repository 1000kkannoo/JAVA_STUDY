package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class S9Q6_친구인가 {
    static String answer = "NO";
    static ArrayList<ArrayList<Integer>> students;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ch = new int[n + 1];

        students = new ArrayList<>();
        for (int i = 0; i <= n; i++) students.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int student = sc.nextInt();
            int friend = sc.nextInt();
            students.get(student).add(friend);
            students.get(friend).add(student);
        }

        int check = sc.nextInt();
        int check2 = sc.nextInt();

        DFS(check, check2);

        System.out.println(answer);
    }

    private static void DFS(int check, int check2) {
        if (answer.equals("YES")) return;
        for (int friends : students.get(check)) {
            if (ch[friends] == 1) continue;
            if (check2 == friends) answer = "YES";
            else {
                ch[check] = 1;
                DFS(friends, check2);
            }
        }
    }

}
