package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 유효한_팰린드롬 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String string = sb.toString();
        String reverseStr = sb.reverse().toString();

        return (string.equals(reverseStr) ? "YES" : "NO");
    }
}
