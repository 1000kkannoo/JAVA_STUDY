import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15649_복습 {
    static int n;
    static int m;
    static int[] ch, print;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        print = new int[m];
        ch = new int[n + 1];
        DFS(0);
    }

    private static void DFS(int i) {
        if (i == m) {
            for (int n : print) {
                System.out.print(n + " ");
            }
            System.out.println();
        } else {
            for (int j = 1; j <= n; j++) {
                if (ch[j] == 0) {
                    print[i] = j;
                    ch[j] = 1;
                    DFS(i + 1);
                    ch[j] = 0;
                }
            }
        }
    }
}
