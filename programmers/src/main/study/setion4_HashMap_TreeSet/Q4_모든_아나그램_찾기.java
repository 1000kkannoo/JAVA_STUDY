package main.study.setion4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q4_모든_아나그램_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution2(str1, str2));
    }

    private static int solution(String str1, String str2) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> matchMap = new HashMap<>();

        for (char key : str2.toCharArray()) matchMap.put(key, matchMap.getOrDefault(key, 0) + 1);
        for (int i = 0; i < str2.length() - 1; i++) map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);

        for (int lt = 0, rt = str2.length() - 1; rt < str1.length(); rt++, lt++) {
            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
            boolean check = true;
            for (char key : map.keySet()) {
                if (!map.get(key).equals(matchMap.get(key))) {
                    check = false;
                    break;
                }
            }
            if (check) answer++;
            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
            if (map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
        }

        return answer;
    }

    private static int solution2(String str1, String str2) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> matchMap = new HashMap<>();

        for (char key : str2.toCharArray()) matchMap.put(key, matchMap.getOrDefault(key, 0) + 1);
        for (int i = 0; i < str2.length() - 1; i++) map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);

        for (int lt = 0, rt = str2.length() - 1; rt < str1.length(); rt++, lt++) {
            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
            if (map.equals(matchMap)) answer++;
            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
            if (map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
        }

        return answer;
    }
}
