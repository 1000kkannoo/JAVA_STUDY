package ch6_SortingAndSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 장난꾸러기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, arr));
    }

    private static String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != sortArr[i]) {
                sb.append(i + 1).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
