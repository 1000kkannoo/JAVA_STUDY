package ch5_Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식_연산 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = str.split("");
        for (String s : arr) {
            if (s.matches("[0-9]")) {
                stack.push(Integer.parseInt(s));
            } else {
                Integer lt = stack.pop();
                Integer rt = stack.pop();
                if (s.equals("+")) {
                    stack.push(rt + lt);
                } else if (s.equals("-")) {
                    stack.push(rt - lt);
                } else if (s.equals("*")) {
                    stack.push(rt * lt);
                } else {
                    stack.push(rt / lt);
                }
            }
        }

        return stack.peek();
    }
}
