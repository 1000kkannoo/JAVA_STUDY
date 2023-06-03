package main.level2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }

    public static String solution(String s) {

        String[] strArray = s.split(" ");

        int[] array = Arrays.stream(strArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        return min + " " + max;
    }
}
