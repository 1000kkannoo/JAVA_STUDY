package main.study.setion1;

import java.util.Scanner;

public class Q1_문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));
    }

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char c : str.toCharArray()) {
            answer = (c == t) ? answer + 1 : answer;
        }

        return answer;
    }
}
