package main.level0;

import java.util.ArrayList;

public class 배열_만들기_5 {
    public static void main(String[] args) {
        int[] solution = solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
        for (int n : solution) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int n = Integer.parseInt(intStr.substring(s, s + l));
            if (n > k) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
