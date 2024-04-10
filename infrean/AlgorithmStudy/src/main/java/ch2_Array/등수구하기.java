package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 등수구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arr));
    }

    private static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int[] ch = new int[101];
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);

        int rank = 1;
        for (int i = sortArr.length - 1; i >= 0; i--) {
            int num = sortArr[i];
            if (ch[num] == 0) {
                ch[num] = rank++;
            } else {
                rank++;
            }
        }

        for (int num : arr) {
            sb.append(ch[num]).append(" ");
        }

        return sb.toString().trim();
    }
}
