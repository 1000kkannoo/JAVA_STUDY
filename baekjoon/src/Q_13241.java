import java.io.BufferedReader;
import java.util.Scanner;

public class Q_13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long gcd = GCD(Math.max(n, m), Math.min(n, m));
        long lcm = n * m / gcd;

        System.out.println(lcm);
    }

    private static long GCD(long max, long min) {
        if (min == 0) return max;
        else return GCD(min, max % min);
    }
}
