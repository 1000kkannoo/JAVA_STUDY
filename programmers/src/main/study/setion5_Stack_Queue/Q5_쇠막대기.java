package main.study.setion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q5_쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        char lastElement = ' ';
        Stack<Character> stack = new Stack<>();
        for (char ch :  str.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else {
                stack.pop();
                answer = (lastElement == '(') ? answer + stack.size() : answer + 1;
            }
            lastElement = ch;
        }
        return answer;
    }
}
