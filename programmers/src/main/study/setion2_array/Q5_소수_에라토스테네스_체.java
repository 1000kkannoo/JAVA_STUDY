package main.study.setion2_array;

import java.util.Scanner;

public class Q5_소수_에라토스테네스_체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    // 시간 초과
    private static int solution2(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            int count = 0;
            boolean check = true;
            for (int j = 1; j <= i; j++) {
                count = (i % j == 0) ? count + 1 : count;
                if (count >= 3) {
                    check = false;
                    break;
                }
            }
            answer = (check) ? answer + 1 : answer;
        }
        return answer;
    }
}
