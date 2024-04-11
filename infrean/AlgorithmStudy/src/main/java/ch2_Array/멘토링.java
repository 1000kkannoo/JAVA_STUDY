package ch2_Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class 멘토링 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int[][] board = new int[m][n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, m, board));
    }

    private static int solution(int n, int m, int[][] board) {
        int answer = 0;
        int[] arr = new int[2];
        for (int student1 = 1; student1 <= n; student1++) {
            for (int student2 = 1; student2 <= n; student2++) {
                if (student2 != student1) {
                    arr[0] = student1;
                    arr[1] = student2;
                    boolean toggle = false;
                    for (int[] ints : board) {
                        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
                        int a = list.indexOf(arr[0]);
                        int b = list.indexOf(arr[1]);
                        if (a < b) {
                            toggle = true;
                            break;
                        }
                    }

                    if (!toggle) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
