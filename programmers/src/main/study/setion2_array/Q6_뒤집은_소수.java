package main.study.setion2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_뒤집은_소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }

        for (int num : solution2(n, intArray)) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int k : intArray) {
            StringBuilder sb = new StringBuilder();
            int reverse = Integer.parseInt(sb.append(k).reverse().toString());
            boolean check = true;

            for (int j = 2; j <= Math.sqrt(reverse); j++) {
                if (reverse % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check && reverse != 1) {
                answer.add(reverse);
            }
        }

        return answer;
    }

    private static ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            // 숫자 뒤집기
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }
        return answer;
    }

    private static boolean isPrime(int res) {
        if (res == 1) return false;
        for (int i = 2; i <= Math.sqrt(res); i++) {
            if (res % i == 0) return false;
        }
        return true;
    }
}
