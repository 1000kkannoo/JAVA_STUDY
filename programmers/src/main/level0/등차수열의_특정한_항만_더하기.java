package main.level0;

public class 등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean in : included) {
            if (in) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}
