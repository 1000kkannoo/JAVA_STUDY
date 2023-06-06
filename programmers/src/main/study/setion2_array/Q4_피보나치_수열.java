package main.study.setion2_array;

import java.util.Scanner;

public class Q4_피보나치_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        solution2(n);
        for (int num : solution(n)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    private static void solution2(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
