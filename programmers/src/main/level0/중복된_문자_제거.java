package main.level0;

import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된_문자_제거 {
    public static void main(String[] args) {
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            set.add(c);
        }

        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();
    }
}
