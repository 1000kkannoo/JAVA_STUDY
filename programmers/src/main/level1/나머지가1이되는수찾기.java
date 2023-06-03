package main.level1;

public class 나머지가1이되는수찾기 {

    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
//        Stream 은 구문을 줄일수는 있지만, 성능 즉 비용이 많이 들어가기에
//        알고리즘에서는 추천하지는 않는다.
//        return IntStream.range(1, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
