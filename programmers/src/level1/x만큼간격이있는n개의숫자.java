package level1;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = (long) x * i;
        }
        return answer;
    }
}
