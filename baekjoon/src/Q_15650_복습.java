import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15650_복습 {
    static int n, m;
    static int[] print;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];

        DFS(0, 1);
    }

    private static void DFS(int i, int index) {
        if (i == m) {
            for (int n : print) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        } else {
            for (int j = index; j <= n; j++) {
                print[i] = j;
                DFS(i + 1, j + 1);
            }
        }
    }

}
