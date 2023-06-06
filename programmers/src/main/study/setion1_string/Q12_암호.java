package main.study.setion1_string;

import java.util.Scanner;

public class Q12_암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution2(n, str));
    }

    private static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.charAt(i - 1));
            if (i % 7 == 0) {
                StringBuilder intString = new StringBuilder();
                String password = sb.toString();

                for (int j = 0; j < password.length(); j++) {
                    if ((password.charAt(j) == '#')) {
                        intString.append(1);
                    } else {
                        intString.append(0);
                    }
                }

                int change = Integer.parseInt(intString.toString(), 2);
                answer.append((char) change);
                sb.setLength(0);
            }
        }
        return answer.toString();
    }

    private static String solution2(int n, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            char c = (char) Integer.parseInt(tmp, 2);
            answer.append(c);
            str = str.substring(7);
        }
        return answer.toString();
    }
}
