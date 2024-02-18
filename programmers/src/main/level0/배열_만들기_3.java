package main.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        int[] solution = solution(arr, intervals);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int[] newArr = Arrays.copyOfRange(arr, interval[0], interval[1] + 1);
            for (int num : newArr) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
