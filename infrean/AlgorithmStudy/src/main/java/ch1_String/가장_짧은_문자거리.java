package ch1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_짧은_문자거리 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        char target = st.nextToken().charAt(0);

        int[] solution = solution(str, target);
        for (int n : solution) {
            System.out.printf("%d ", n);
        }

    }

    private static int[] solution(String str, char target) {
        int[] answer = new int[str.length()];
        char[] charArray = str.toCharArray();

        int count = 10000;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == target) {
                count = 0;
            } else {
                count++;
            }
            answer[i] = count;
        }

        count = 10000;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == target) {
                count = 0;
            } else {
                count++;
            }
            answer[i] = Math.min(answer[i], count);
        }

        return answer;
    }
}
