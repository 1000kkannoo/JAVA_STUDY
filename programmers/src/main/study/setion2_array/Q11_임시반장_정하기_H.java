package main.study.setion2_array;

import java.util.Scanner;

public class Q11_임시반장_정하기_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

/*    private static int solution(int n, int[][] arr) {
        int[] answerArr = new int[n];
        int answer = 1;

        for (int i = 0; i < answerArr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        answerArr[i]++;
                        answerArr[j]++;
                        break;
                    }
                }
            }
        }
        return answer;
    }*/
}
