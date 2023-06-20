import java.util.Scanner;

public class Q_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(solution(a, b, c));
    }

    private static long solution(long a, long b, long c) {
        return a + b + c;
    }
}
