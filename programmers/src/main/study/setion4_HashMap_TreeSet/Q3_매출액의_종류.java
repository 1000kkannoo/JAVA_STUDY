package main.study.setion4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q3_매출액의_종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : solution(n, k, arr)) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[n - k + 1];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer[0] = map.size();

        int lt = 0, rt = k;
        for (int i = 1; rt < arr.length; i++, lt++, rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            answer[i] = map.size();
        }

        return answer;
    }
}
