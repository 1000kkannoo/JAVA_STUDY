import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Q_1929 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ch = new int[m + 1];

        for (int i = 2; i <= m; i++) {
            if (ch[i] != 1) {
                if (i >= n) sb.append(i).append("\n");
                int count = 1;
                while (i * count <= m) ch[i * count++] = 1;
            }
        }

        System.out.println(sb);
    }
}
