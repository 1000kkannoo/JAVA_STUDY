package ch5_Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정_설계 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : str1.toCharArray()) {
            queue.offer(c);
        }

        char[] arr = str2.toCharArray();
        for (char c : arr) {
            if (queue.isEmpty()) {
                break;
            } else if (queue.peek() == c) {
                queue.poll();
            } else {
                if (queue.contains(c)) {
                    return "NO";
                }
            }
        }

        return (queue.isEmpty()) ? "YES" : "NO";
    }
}
