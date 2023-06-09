package main.study.setion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q3_크레인_인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n + 1; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, m, moves));
    }

    private static int solution(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            for (int j = 0; j < n; j++) {
                if (board[j][move] != 0) {
                    int tmp = board[j][move];
                    board[j][move] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    }
                    else stack.add(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    private static int solution2(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int beforeTarget = 0, target = 0, answer = 0;

        for (int move : moves) {
            for (int j = 0; j < n; j++) {
                target = board[j][move];
                if (target != 0) {
                    board[j][move] = 0;
                    stack.add(target);
                    break;
                }
            }
            if (beforeTarget == target) {
                answer += 2;
                stack.pop();
                stack.pop();
            }
            beforeTarget = stack.lastElement();
        }
        return answer;
    }
}
