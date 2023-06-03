package main.level0;

public class 정수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
    }

    private static int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1;
            }
        }
        return 0;
    }
}
