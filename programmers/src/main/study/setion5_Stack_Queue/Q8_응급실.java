package main.study.setion5_Stack_Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int num;

    public Person(int id, int num) {
        this.id = id;
        this.num = num;
    }
}

public class Q8_응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while (true) {
            Person poll = queue.poll();
            for (Person person : queue) {
                if (person.num > poll.num) {
                    queue.offer(poll);
                    poll = null;
                    break;
                }
            }
            if (poll != null) {
                if (poll.id == m) return answer;
                else answer++;
            }
        }
    }
}
