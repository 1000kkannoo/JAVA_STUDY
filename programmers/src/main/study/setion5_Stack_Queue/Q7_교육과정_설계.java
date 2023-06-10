package main.study.setion5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7_교육과정_설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        Queue<Character> queue = new LinkedList<>();
        for (char ch : str1.toCharArray()) {
            queue.offer(ch);
        }

        for (char ch : str2.toCharArray()) {
            if (queue.contains(ch)) {
                if (ch != queue.poll()) return "NO";
            }
        }

        return (queue.isEmpty()) ? "YES" : "NO";
    }
}
