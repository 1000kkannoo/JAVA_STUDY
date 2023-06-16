package main.study.setion9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Schedule implements Comparable<Schedule> {
    int time;
    char state;

    public Schedule(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Schedule schedule) {
        int sort = this.time - schedule.time;
        if (sort == 0) return this.state - schedule.state;
        return sort;
    }
}

public class S9Q3_결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Schedule> friends = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int arrival = sc.nextInt();
            int departure = sc.nextInt();
            friends.add(new Schedule(arrival, 's'));
            friends.add(new Schedule(departure, 'e'));
        }

        System.out.print(solution(n, friends));
    }

    private static int solution(int n, ArrayList<Schedule> friends) {
        Collections.sort(friends);
        int answer = Integer.MIN_VALUE, cnt = 0;
        for (Schedule schedule : friends) {
            cnt = (schedule.state == 's') ? cnt + 1 : cnt - 1;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
}
