package main.level2;

import java.util.ArrayList;
import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution2("cdcd"));
    }

    public static int solution2(String s) {
        Stack<Character> queue = new Stack<>();

        queue.push(s.charAt(0));
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            char peek = ' ';
            if (!queue.isEmpty()) peek = queue.peek();
            if (peek == chars[i]) queue.pop();
            else queue.push(chars[i]);
        }

        if (queue.isEmpty()) return 1;
        return 0;
    }

    // 시간 초과
    public static int solution(String s) {
        ArrayList<Character> arr = new ArrayList<>();

        for (char ch : s.toCharArray()) arr.add(ch);

        boolean flag = true;
        while (flag) {
            boolean stop = true;
            for (int i = 1; i < arr.size(); i++) {
                char prev = arr.get(i - 1);
                if (prev == arr.get(i)) {
                    arr.remove(i);
                    arr.remove(i - 1);
                    stop = false;
                    break;
                }
            }
            if (stop) break;
        }

        if (arr.isEmpty()) return 1;
        return 0;
    }
}
