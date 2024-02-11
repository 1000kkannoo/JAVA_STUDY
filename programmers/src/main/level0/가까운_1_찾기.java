package main.level0;

public class 가까운_1_찾기 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        int idx = 1;
        System.out.println(solution(arr, idx));
    }

    public static int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
