package ch10_dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_부분_증가수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
        }
        int[] count = new int[n];

        System.out.println(solution(arr, count));
    }

    private static int solution(int[] arr, int[] count) {
        int answer = 0;
        count[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            count[i] = 1;
            int j = i - 1;
            while (j >= 0) {
                if (num >= arr[j]) count[i] = Math.max(count[i], count[j] + 1);
                j--;
            }
            answer = Math.max(answer, count[i]);
        }

        return answer;
    }
}
