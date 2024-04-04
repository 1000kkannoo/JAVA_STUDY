package main.level0;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return (stack.isEmpty()) ? true : false;
    }
}
