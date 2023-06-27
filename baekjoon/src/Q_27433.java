import java.util.Scanner;

public class Q_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = (n == 0) ? 1 : n;

        for (int i = n - 1; i >= 1; i--) sum *= i;

        System.out.println(sum);
    }
}
