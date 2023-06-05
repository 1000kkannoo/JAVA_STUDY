package main.level0;

import java.util.Arrays;

public class 뒤에서_5등_위로 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10}));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];

        Arrays.sort(num_list);
        for (int i = 0, index = 5; i < answer.length; i++, index++) {
            answer[i] = num_list[index];
        }

        return answer;
    }
}
