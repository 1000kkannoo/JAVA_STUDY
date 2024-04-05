package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문장_속_단어 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        String[] split = str.split(" ");
        int maxLength = Integer.MIN_VALUE;

        for (String s : split) {
            if (maxLength < s.length()) {
                maxLength = s.length();
                answer = s;
            }
        }

        return answer;
    }
}
