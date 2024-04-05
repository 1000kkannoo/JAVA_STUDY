package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 특정_문자_뒤집기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }
}
