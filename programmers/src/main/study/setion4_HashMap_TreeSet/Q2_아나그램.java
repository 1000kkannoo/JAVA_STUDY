package main.study.setion4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q2_아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution2(str1, str2));
    }

    private static String solution2(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : str2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key) - 1);
        }

        return answer;
    }

    private static String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        for (char ch : map1.keySet()) {
            if (!map1.get(ch).equals(map2.get(ch))) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }
}
