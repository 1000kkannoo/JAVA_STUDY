package main.study.setion1_string;

import java.util.Scanner;

public class Q9_숫자만_추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    private static int solution2(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = (answer * 10) + (x - 48);
            }
        }
        return answer;
    }

    private static int solution3(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }
}
