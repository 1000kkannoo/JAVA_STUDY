package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 회문문자열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        for (int lt = 0, rt = charArray.length - 1; lt < rt; lt++, rt--) {
            if (charArray[lt] != charArray[rt]) {
                return "NO";
            }
        }
        return "YES";
    }
}
