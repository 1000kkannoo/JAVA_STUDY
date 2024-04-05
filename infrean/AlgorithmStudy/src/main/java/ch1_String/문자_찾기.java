package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자_찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String find = br.readLine();

        System.out.println(solution(str, find));
    }

    private static int solution(String str, String find) {
        int answer = 0;
        String[] split = str.toLowerCase().split("");
        String lowerCase = find.toLowerCase();
        for (String s : split) {
            if (s.equals(lowerCase)) {
                answer++;
            }
        }
        return answer;
    }
}
