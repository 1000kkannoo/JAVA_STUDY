package main.level0;

import java.util.Arrays;

public class 뒤에서_5등까지 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, 1, 14}));
    }

    private static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
