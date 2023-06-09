package main.study.setion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q1_올바른_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "NO";
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()){
            if (ch == '(') stack.push(1);
            else {
                if (stack.isEmpty()) return answer;
                stack.pop();
            }
        }

        if (stack.isEmpty()) answer = "YES";

        return answer;
    }
}
