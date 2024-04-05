package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 단어_뒤집기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        String answer = solution(n, arr);
        System.out.println(answer);
    }

    private static String solution(int n, String[] arr) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            String reverseStr = sb.append(s).reverse().toString();
            answer.append(reverseStr).append("\n");
            sb.setLength(0);
        }
        return answer.toString();
    }
}
