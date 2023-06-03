package main.level0;

public class 양_꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(64, 6));
    }

    private static int solution(int n, int k) {
        int priceCount = (n / 10) * 2000;
        return (n * 12000) + (k * 2000) - priceCount;
    }
}
