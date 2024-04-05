package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 암호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(solution(size, s));

    }

    private static String solution(int size, String s) {
        String[] codes = new String[size];
        StringBuilder sb = new StringBuilder();

        int first = 0;
        int last = 7;
        for (int i = 0; i < size; i++) {
            codes[i] = s.substring(first, last);
            first = last;
            last = last + 7;
        }

        for (String code : codes) {
            String replace = code.replace("*", "0").replace("#", "1");
            char c = (char) Integer.parseInt(replace, 2);
            sb.append(c);
        }

        return sb.toString();
    }
}
