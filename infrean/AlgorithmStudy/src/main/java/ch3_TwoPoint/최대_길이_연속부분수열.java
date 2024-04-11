package ch3_TwoPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대_길이_연속부분수열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int count = m;
        int lt = 0, rt = 0;
        while (rt < n) {
            if (arr[rt] == 1) {
                rt++;
            } else if (arr[rt] == 0) {
                if (count > 0) {
                    count--;
                    arr[rt] = -1;
                    rt++;
                } else {
                    answer = Math.max(answer, rt - lt);
                    while (true) {
                        if (arr[lt] == -1) {
                            arr[lt] = 0;
                            count++;
                            lt++;
                            break;
                        } else {
                            lt++;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
