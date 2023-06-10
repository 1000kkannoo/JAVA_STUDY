package main.study.setion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q4_후위연산식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) stack.push(ch - '0');
            else {
                int a = stack.pop();
                int b = stack.pop();
                switch (ch) {
                    case '+' : stack.push(b + a); break;
                    case '-' : stack.push(b - a); break;
                    case '*' : stack.push(b * a); break;
                    case '/' : stack.push(b / a); break;
                }
            }
        }
        return stack.firstElement();
    }
}
