package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 큰_수_출력하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, arr));
    }

    private static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
