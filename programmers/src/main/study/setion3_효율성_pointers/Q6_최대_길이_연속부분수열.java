package main.study.setion3_효율성_pointers;

import java.util.Scanner;

public class Q6_최대_길이_연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int cnt = 0, answer = 0, p1 = 0, p2 = 0;
        for (int i = 0, j = 0; i < m; j++) {
            if (arr[j] == 0) {
                if (p1 == 0) {
                    p1 = j;
                } else {
                    p2 = j;
                }
                arr[j] = 1;
                i++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                answer = Math.max(answer, cnt);
                if (p1 != 0 && p2 != 0) {
                    arr[i] = 1;
                    arr[p1] = 0;
                    cnt
                }
            } else {
                cnt++;
            }
        }

        return 0;
    }
}
