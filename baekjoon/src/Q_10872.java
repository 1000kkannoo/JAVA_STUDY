import java.util.Scanner;

public class Q_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (n == 0) ? 1 : n;

        for (int i = n - 1; i >= 1; i--) sum *= i;

        System.out.println(sum);
    }
}
