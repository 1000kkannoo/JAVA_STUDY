package main.study.setion3_효율성_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2_공통원소_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrB = new int[m];
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int num : solution(n, arrA, m, arrB)) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int k : arrA) {
            for (int i : arrB) {
                if (k == i) {
                    answer.add(k);
                    break;
                }
            }
        }
        answer.sort(Integer::compareTo);
        return answer;
    }

    private static ArrayList<Integer> solution2(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int arrAp = 0, arrBp = 0;
        while (arrAp < n && arrBp < m) {
            if (arrA[arrAp] == arrB[arrBp]) {
                answer.add(arrA[arrAp++]);
                arrBp++;
            } else if (arrA[arrAp] > arrB[arrBp]) {
                arrBp++;
            } else {
                arrAp++;
            }

        }
        return answer;
    }
}
