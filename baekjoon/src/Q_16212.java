import java.util.Arrays;
import java.util.Scanner;

public class Q_16212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            System.out.print(array[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
