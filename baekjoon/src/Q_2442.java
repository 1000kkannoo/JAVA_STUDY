import java.util.Scanner;

public class Q_2442 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n;
        int b = 1;
        for (int i = 0; i < n; i++) {
            for (int j = a - 1; j > 0; j--) sb.append(" ");
            for (int j = 0; j < b; j++) sb.append("*");
            sb.append("\n");
            a -= 1;
            b += 2;
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
