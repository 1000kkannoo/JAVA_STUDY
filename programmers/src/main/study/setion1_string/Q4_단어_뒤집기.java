package main.study.setion1_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4_단어_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : solution2(n, str)) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String reverse = new StringBuilder(s).reverse().toString();
            answer.add(reverse);
        }
        return answer;
    }

    private static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            for (int lt = 0, rt = chars.length - 1; lt < rt; lt++, rt--) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
            }
            answer.add(String.valueOf(chars));
        }
        return answer;
    }
}
