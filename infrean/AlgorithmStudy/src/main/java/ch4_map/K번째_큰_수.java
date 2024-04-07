package ch4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class K번째_큰_수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);
        int answer = -1;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    set.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        if (!set.isEmpty() && set.size() >= m) {
            for (int i = 0; i < m - 1; i++) {
                set.pollFirst();
            }
            answer = set.first();
        }

        return answer;
    }
}
