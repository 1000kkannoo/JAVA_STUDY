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

        String string = s.toLowerCase().replaceAll("[^a-z]","");
        String reverseStr = new StringBuilder(string).reverse().toString();

        return (string.equals(reverseStr) ? "YES" : "NO");
    }
}
