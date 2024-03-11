package main.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트_자르기 {
    public static void main(String[] args) {
        int[] solution = solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            return Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            int[] arr = Arrays.copyOfRange(num_list, a, b + 1);
            List<Integer> list = new ArrayList<>();

            int count = 0;
            list.add(arr[0]);
            for (int j : arr) {
                if (count == c) {
                    count = 1;
                    list.add(j);
                } else {
                    count++;
                }
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}
