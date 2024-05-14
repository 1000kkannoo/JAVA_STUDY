import java.util.Arrays;
import java.util.Scanner;

public class Q_31796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        int pages = 1;
        int minPriceInCurrentPage = prices[0];

        for (int i = 1; i < N; i++) {
            if (prices[i] >= minPriceInCurrentPage * 2) {
                pages++;
                minPriceInCurrentPage = prices[i];
            }
        }

        System.out.println(pages);
    }
}
