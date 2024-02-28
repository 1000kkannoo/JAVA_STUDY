package main.level0;

import java.util.*;

public class 한_번만_등장한_문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character ch : map.keySet()) {
            int value = map.get(ch);
            if (value == 1) {
                list.add(ch);
            }
        }

        list.sort(Character::compareTo);

        for (Character character : list) {
            sb.append(character);
        }

        return sb.toString();
    }
}
