package ch4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 매출액의_종류 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, m, arr));
    }

    private static String solution(int n, int m, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sb.append(map.size()).append(" ");

        for (int i = m; i < n; i++) {
            if (map.get(arr[i - m]) == 1) {
                map.remove(arr[i - m]);
            } else {
                map.put(arr[i - m], map.get(arr[i - m]) - 1);
            }

            // 윈도우에 새 요소 추가
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            sb.append(map.size()).append(" ");
        }

        return sb.toString();
    }
}
