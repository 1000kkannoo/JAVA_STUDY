package ch3_TwoPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두_배열_합치기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arrN, arrM));
    }

    private static String solution(int[] arrN, int[] arrM) {
        StringBuilder sb = new StringBuilder();
        int[] answer = new int[arrN.length + arrM.length];
        System.arraycopy(arrN, 0, answer, 0, arrN.length);
        System.arraycopy(arrM, 0, answer, arrN.length, arrM.length);

        Arrays.sort(answer);
        for (int n : answer) {
            sb.append(n).append(" ");
        }

        return sb.toString();
    }
}
