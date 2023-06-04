package main.level0;

public class n보다_커질_때까지_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
    }

    private static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int num : numbers) {
            answer += num;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}
