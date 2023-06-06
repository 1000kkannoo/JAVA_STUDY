package main.study.setion1_string;

import java.util.Scanner;

public class Q8_유효한_팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }

        String result = String.valueOf(sb);
        String resultReverse = String.valueOf(sb.reverse());
        return (result.equalsIgnoreCase(resultReverse)) ? "YES" : "NO";
    }

    private static String solution2(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String reverse = new StringBuilder(str).reverse().toString();
        return (str.equals(reverse)) ? "YES" : "NO";
    }
}
