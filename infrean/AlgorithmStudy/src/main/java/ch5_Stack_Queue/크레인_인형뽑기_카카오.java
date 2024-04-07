package ch5_Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 크레인_인형뽑기_카카오 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(split[j]);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(solution(n, board, m, arr));
    }

    private static int solution(int n, int[][] board, int m, int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int select : arr) {
            for (int i = 0; i < n; i++) {
                int toy = board[i][select - 1];
                if (toy != 0) {
                    board[i][select - 1] = 0;
                    if (!stack.isEmpty()) {
                        if (stack.peek() == toy) {
                            answer++;
                            stack.pop();
                        } else {
                            stack.push(toy);
                        }
                    } else {
                        stack.push(toy);
                    }
                    break;
                }
            }
        }

        return answer * 2;
    }
}
