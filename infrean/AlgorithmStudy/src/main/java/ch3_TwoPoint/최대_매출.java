package ch3_TwoPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최대_매출 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(m, arr));
    }

    private static int solution(int m, int[] arr) {
        int num = 0;
        for (int i = 0; i < m; i++) {
            num += arr[i];
        }

        int max = num;
        for (int i = m; i < arr.length; i++) {
            num = num + arr[i] - arr[i - m];
            max = Math.max(max, num);
        }

        return max;
    }
}
