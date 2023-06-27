import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_15652 {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        for (int i = 1; i <= n; i++) {
            arr[0] = i;
            DFS(i, 1);
        }

        System.out.println(sb);
    }

    private static void DFS(int i, int index) {
        if (index == m) {
            for (int num : arr) sb.append(num).append(" ");
            sb.append("\n");
        } else {
            for (int j = i; j <= n; j++) {
                arr[index] = j;
                DFS(j, index + 1);
            }
        }
    }
}
