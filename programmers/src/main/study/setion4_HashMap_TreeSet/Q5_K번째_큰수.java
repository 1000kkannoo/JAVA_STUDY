package main.study.setion4_HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Q5_K번째_큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> setT = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    setT.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int num : setT) {
            cnt++;
            if (cnt == k) return num;
        }

        return answer;
    }
}
