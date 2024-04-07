package ch4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 아나그램 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }

        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return "NO";
            } else if (!map1.get(key).equals(map2.get(key))) {
                return "NO";
            }
        }

        return "YES";
    }
}
