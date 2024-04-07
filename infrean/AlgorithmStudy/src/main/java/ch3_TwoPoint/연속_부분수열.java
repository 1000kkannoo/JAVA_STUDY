package ch3_TwoPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 연속_부분수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(arr, m));
    }

    private static int solution(int[] arr, int m) {
        int count = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            while (sum > m) {
                sum -= arr[lt++];
            }
            if (sum == m) {
                count++;
            }
        }

        return count;
    }
}
