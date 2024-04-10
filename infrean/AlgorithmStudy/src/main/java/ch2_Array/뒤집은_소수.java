package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뒤집은_소수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        System.out.println(solution(n, arr));
    }

    private static String solution(int n, String[] arr) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (String number : arr) {
            for (char c : number.toCharArray()) {
                sb.append(c);
            }
            int num = Integer.parseInt(sb.reverse().toString());
            boolean flag = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && num != 1) {
                answer.append(num).append(" ");
            }
            sb.setLength(0);
        }

        return answer.toString();
    }
}
