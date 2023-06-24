import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Point3 implements Comparable<Point3> {
    int x;
    int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point3 o) {
        if (this.y == o.y) return this.x - o.x;
        return this.y - o.y;
    }
}

public class Q_11651 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Point3> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new Point3(x, y));
        }

        Collections.sort(arr);

        for (Point3 point3 : arr) {
            sb.append(point3.x).append(" ").append(point3.y).append("\n");
        }
        System.out.println(sb);
    }
}
