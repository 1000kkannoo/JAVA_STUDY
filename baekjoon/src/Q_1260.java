import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1260 {
    static int n;
    static int[] ch;
    static boolean flag = false;
    static ArrayList<TreeSet<Integer>> table;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        table = new ArrayList<>();
        for (int i = 0; i <= n; i++) table.add(new TreeSet<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            table.get(a).add(b);
            table.get(b).add(a);
        }

        ch = new int[n + 1];
        DFS(v, 0);
        System.out.println(sb.toString());

        Arrays.fill(ch, 0);
        sb = new StringBuilder();

        BFS(v);
        System.out.println(sb.toString());
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        sb.append(v).append(" ");
        ch[v] = 1;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            for (int num : table.get(poll)) {
                if (ch[num] != 1) {
                    ch[num] = 1;
                    sb.append(num).append(" ");
                    queue.offer(num);
                }
            }
        }
    }

    private static void DFS(int v, int count) {
        if (flag) return;
        if (ch[v] == 1) return;
        if (count == n) flag = true;
        else {
            ch[v] = 1;
            sb.append(v).append(" ");
            for (int num : table.get(v)) DFS(num, count++);
        }
    }
}
