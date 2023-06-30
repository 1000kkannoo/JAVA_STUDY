package main.level2;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 20, 40, 70, 84, 89, 92}, 200));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt = 0;
        for (int rt = people.length - 1; lt <= rt; ) {
            if (people[lt] + people[rt] <= limit) lt++;
            rt--;
            answer++;
        }
        return answer;
    }
}
