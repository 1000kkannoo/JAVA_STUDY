import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2606 {
    static ArrayList<ArrayList<Integer>> table;
    static int[] ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        table = new ArrayList<>();

        for (int i = 0; i <= n; i++) table.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int point = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            table.get(point).add(next);
            table.get(next).add(point);
        }

        ch = new int[n + 1];
        BFS(1);
    }

    private static void BFS(int p) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(p);
        int count = 0;
        ch[p] = 1;
        while (!q.isEmpty()) {
            for (int num : table.get(q.poll())) {
                if (ch[num] == 0) {
                    ch[num] = 1;
                    count++;
                    q.offer(num);
                }
            }
        }
        System.out.println(count);
    }
}
