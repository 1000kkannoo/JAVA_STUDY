package main.study.setion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q2_괄호문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution2(str));
    }

    private static String solution2(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(ch);
        }

        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') stack.pop();
            else if (stack.isEmpty()) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
