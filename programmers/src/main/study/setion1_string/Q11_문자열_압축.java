package main.study.setion1_string;

import java.util.Scanner;

public class Q11_문자열_압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution2(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char check = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = (s.charAt(i) == check) ? count + 1 : count;

            if (i == s.length() - 1) break;

            if (s.charAt(i) != s.charAt(i + 1)) {
                sb = (count > 1) ? sb.append(check).append(count) : sb.append(check);
                check = s.charAt(i + 1);
                count = 0;
            }
        }

        sb = (count > 1) ? sb.append(check).append(count) : sb.append(check);
        return String.valueOf(sb);
    }

    private static String solution2(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                sb = (cnt > 1) ? sb.append(s.charAt(i)).append(cnt) : sb.append(s.charAt(i));
                cnt = 1;
            }
        }
        return String.valueOf(sb);
    }
}
