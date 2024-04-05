package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열_압축 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        s = s + " "; // 문자열 끝 처리를 위해 공백 문자 추가
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }
        return sb.toString();
    }
}
