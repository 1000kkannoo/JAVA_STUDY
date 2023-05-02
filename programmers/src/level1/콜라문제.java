package level1;

public class 콜라문제 {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }

    public static int solution(int a, int b, int n) {
        int coke = 0;
        while (n >= a) {
            coke += (n / a) * b;
            n -= (n / a) * (a - b);
        }
        return coke;
    }
}
