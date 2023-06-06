package main.study.setion2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_가위_바위_보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }


        for (Character ch : solution2(n, A, B).toCharArray()) {
            System.out.println(ch);
        }
    }

    private static ArrayList<Character> solution(int n, int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer.add('D');
            } else if (a[i] > b[i]) {
                if (a[i] == 3 && b[i] == 1) answer.add('B');
                else answer.add('A');
            } else {
                if (a[i] == 1 && b[i] == 3) answer.add('A');
                else answer.add('B');
            }
        }
        return answer;
    }

    private static String solution2 (int n, int[] a, int[] b) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer.append('D');
            else if (a[i] == 1 && b[i] == 3) answer.append('A');
            else if (a[i] == 2 && b[i] == 1) answer.append('A');
            else if (a[i] == 3 && b[i] == 2) answer.append('A');
            else answer.append('B');
        }
        return answer.toString();
    }
}
