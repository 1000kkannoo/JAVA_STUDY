import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_11724 {
    static int[] ch;
    static ArrayList<ArrayList<Integer>> table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        table = new ArrayList<>();
        for (int i = 0; i <= n; i++) table.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            table.get(u).add(v);
            table.get(v).add(u);
        }

        // n ==6 ? {0,1,2,3,4,5,6}
        ch = new int[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (ch[i] == 0) {
                ch[i] = 1;
                DFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void DFS(int i) {
        for (int index : table.get(i)) {
            if (ch[index] == 0) {
                ch[index] = 1;
                DFS(index);
            }
        }
    }
}
