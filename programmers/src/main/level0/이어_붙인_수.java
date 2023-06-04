package main.level0;

public class 이어_붙인_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
    }

    private static int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for(int num : num_list) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
