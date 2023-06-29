import java.io.BufferedReader;
import java.util.Scanner;

public class Q_10162 {
    static int[] time = {300, 60, 10};
    static int[] count = {0, 0, 0};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            while (n >= time[i]) {
                n -= time[i];
                count[i]++;
            }
        }

        if (n != 0) System.out.println(-1);
        else {
            for (int num : count) sb.append(num).append(" ");
            System.out.println(sb);
        }
    }
}

