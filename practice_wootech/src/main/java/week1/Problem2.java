package week1;

import java.util.Stack;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(solution("browoanoommnaon"));
    }

    private static String solution(String word) {
        Stack<Character> stack = removeConsecutiveDuplicates(word);
        return stackToString(stack);
    }

    private static String stackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();

        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();
    }

    private static Stack<Character> removeConsecutiveDuplicates(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == word.charAt(i)) {
                char target = word.charAt(i);
                while (i < word.length() && word.charAt(i) == target) {
                    i++;
                }
                stack.pop();
                i--;
            } else {
                stack.push(word.charAt(i));
            }
        }
        
        return stack;
    }
}
