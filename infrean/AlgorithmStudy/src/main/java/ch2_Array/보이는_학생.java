package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 보이는_학생 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                answer++;
                max = j;
            }
        }
        return answer;
    }
}
