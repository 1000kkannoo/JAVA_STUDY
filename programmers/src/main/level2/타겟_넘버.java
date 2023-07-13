package main.level2;

public class 타겟_넘버 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 1, 2, 1}, 4));
    }

    static int[] arr;
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        arr = numbers;
        DFS(0, 0, target);
        return answer;
    }

    private static void DFS(int i, int sum, int target) {
        if (i >= arr.length) {
            if (sum == target) answer++;
            return;
        }
        DFS(i + 1, sum + arr[i], target);
        DFS(i + 1, sum - arr[i], target);
    }
}
