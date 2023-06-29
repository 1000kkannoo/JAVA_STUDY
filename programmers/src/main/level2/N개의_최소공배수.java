package main.level2;

import java.util.Arrays;

public class N개의_최소공배수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        int lcm = max;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (lcm % arr[i] != 0) {
                    flag = true;
                    lcm += max;
                    break;
                }
            }
        }

        return lcm;
    }
}
