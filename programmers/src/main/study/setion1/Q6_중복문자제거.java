package main.study.setion1;

import java.util.Scanner;

public class Q6_중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution2(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return String.valueOf(sb);
    }

    private static String solution2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
