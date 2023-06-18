package main.level0;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        String pat = sc.next();

        System.out.println(solution(myString, pat));
    }

    private static int solution(String myString, String pat) {
        int answer = 0;
        int length = myString.length() - pat.length();
        for (int i = 0; i <= length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + pat.length(); j++) {
                sb.append(myString.charAt(j));
            }
            if (sb.toString().equals(pat)) answer++;
        }

        return answer;
    }
}
