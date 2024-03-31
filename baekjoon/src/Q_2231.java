import java.util.Scanner;

public class Q_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = getResult(n);

        System.out.println(result);
    }

    private static int getResult(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = i;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            if (sum == n) {
                return i;
            }
        }

        return 0;
    }
}
