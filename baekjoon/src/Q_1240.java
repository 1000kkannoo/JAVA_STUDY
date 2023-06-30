import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point4 {
    int nextP;
    int distance;

    public Point4(int nextP, int distance) {
        this.nextP = nextP;
        this.distance = distance;
    }
}

public class Q_1240 {
    static boolean flag;
    static int n, m, sum;
    static int[] ch;
    static ArrayList<ArrayList<Point4>> arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) arr.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int point = Integer.parseInt(st.nextToken());
            int nextPoint = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            arr.get(point).add(new Point4(nextPoint, distance));
            arr.get(nextPoint).add(new Point4(point, distance));
        }

        sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            flag = false;
            sum = 0;
            ch = new int[n + 1];
            ch[start] = 1;
            DFS(start, end);
        }

        System.out.println(sb.toString());
    }

    private static void DFS(int start, int end) {
        if (start == end) {
            flag = true;
            sb.append(sum).append("\n");
            return;
        }
        ArrayList<Point4> points = arr.get(start);
        for (Point4 point : points) {
            if (ch[point.nextP] == 0) {
                ch[point.nextP] = 1;
                sum += point.distance;
                DFS(point.nextP, end);
                if (flag) return;
                ch[point.nextP] = 0;
                sum -= point.distance;
            }
        }
    }
}
