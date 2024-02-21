package main.level0;

import java.util.ArrayList;
import java.util.List;

public class 콜라츠_수열 {
    public static void main(String[] args) {
        int[] solution = solution(10);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add(n);
            if (n == 1) {
                break;
            } else if (n % 2 == 0) {
                n /= 2;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
