package main.level0;

public class 첫번째로_나오는_음수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
    }

    private static int solution(int[] num_list) {
        int i;
        for (i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
