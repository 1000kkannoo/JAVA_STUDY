package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위_바위_보 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] playerA = new int[n];
        int[] playerB = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            playerA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            playerB[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, playerA, playerB));
    }

    private static String solution(int n, int[] playerA, int[] playerB) {
        StringBuilder sb = new StringBuilder();

        // 1: 가위, 2: 바위, 3: 보
        for (int i = 0; i < n; i++) {
            int roundA = playerA[i];
            int roundB = playerB[i];

            if (roundA == roundB) {
                sb.append("D").append("\n");
            } else if (roundA == 1) {
                if (roundB == 3) {
                    sb.append("A").append("\n");
                } else {
                    sb.append("B").append("\n");
                }
            } else if (roundA == 2) {
                if (roundB == 3) {
                    sb.append("B").append("\n");
                } else {
                    sb.append("A").append("\n");
                }
            } else {
                if (roundA == 3) {
                    if (roundB == 1) {
                        sb.append("B").append("\n");
                    } else {
                        sb.append("A").append("\n");
                    }
                }
            }
        }

        return sb.toString();
    }
}
