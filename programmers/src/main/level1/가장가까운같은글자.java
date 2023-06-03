package main.level1;

import java.util.Arrays;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            int count = 0;
            boolean found = false;
            for (int j = i - 1; 0 <= j; j--) {
                count++;
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            answer[i] = (found) ? count : -1;
        }
        return answer;
    }
}
