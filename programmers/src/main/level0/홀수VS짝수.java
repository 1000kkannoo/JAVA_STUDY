package main.level0;

public class 홀수VS짝수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
    }

    private static int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        return Math.max(evenSum, oddSum);
    }
}
