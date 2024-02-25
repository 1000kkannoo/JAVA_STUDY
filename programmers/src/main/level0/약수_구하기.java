package main.level0;

import java.util.ArrayList;
import java.util.List;

public class 약수_구하기 {
    public static void main(String[] args) {
        int[] solution = solution(24);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
