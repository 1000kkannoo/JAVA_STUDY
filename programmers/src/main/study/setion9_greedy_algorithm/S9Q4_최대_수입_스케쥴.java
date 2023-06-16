package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int day;

    public Lecture(int money, int time) {
        this.money = money;
        this.day = time;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.day - this.day;
    }
}

public class S9Q4_최대_수입_스케쥴 {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Lecture> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            arrayList.add(new Lecture(money, day));
            if (day > max) max = day;
        }
        System.out.println(solution(n, arrayList));
    }

    private static int solution(int n, ArrayList<Lecture> arrayList) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arrayList);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arrayList.get(j).day < i) break;
                priorityQueue.offer(arrayList.get(j).money);
            }
            if (!priorityQueue.isEmpty()) answer += priorityQueue.poll();
        }
        return answer;
    }
}
