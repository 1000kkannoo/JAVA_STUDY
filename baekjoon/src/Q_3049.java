import java.util.Scanner;

public class Q_3049 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= 4; i++) {
            result *= n - i + 1;
            result /= i;
        }

        System.out.println(result);
    }
}
