package main.study.setion1;

import java.util.Scanner;

public class Q7_회문_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] chars = str.toUpperCase().toCharArray();
        for (int lt = 0, rt = chars.length - 1; lt < rt; lt++, rt--) {
            if (chars[lt] != chars[rt]) {
                return "NO";
            }
        }
        return "YES";
    }

    private static String solution2(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    private static String solution3(String str) {
        String sb = new StringBuilder(str).reverse().toString();
        return (str.equalsIgnoreCase(sb)) ? "YES" : "NO";
    }
}
