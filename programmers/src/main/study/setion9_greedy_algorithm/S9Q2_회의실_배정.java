package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time t) {
        int sort = this.end - t.end;
        if (sort == 0) return this.start - t.start;
        return sort;
    }
}

public class S9Q2_회의실_배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            times.add(new Time(start, end));
        }

        System.out.print(solution(n, times));
    }

    private static int solution(int n, ArrayList<Time> times) {
        Collections.sort(times);
        int max = Integer.MIN_VALUE, answer = 0;
        for (Time time : times) {
            if (max <= time.start) {
                max = time.end;
                answer++;
            }
        }
        return answer;
    }
}
