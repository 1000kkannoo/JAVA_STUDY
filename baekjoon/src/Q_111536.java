import java.util.Scanner;

public class Q_111536 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[N];

        for (int i = 0; i < N; i++) {
            names[i] = scanner.nextLine();
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < N - 1; i++) {
            if (names[i].compareTo(names[i + 1]) < 0) {
                isDecreasing = false;
            } else if (names[i].compareTo(names[i + 1]) > 0) {
                isIncreasing = false;
            }
        }

        if (isIncreasing) {
            System.out.println("INCREASING");
        } else if (isDecreasing) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

        scanner.close();
    }
}
