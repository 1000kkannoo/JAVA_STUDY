import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Location implements Comparable<Location> {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Location ob) {
        if (this.x == ob.x) return this.y - ob.y;
        return this.x - ob.x;
    }
}

public class Q_11650 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Location> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrayList.add(new Location(x, y));
        }

        Collections.sort(arrayList);
        for (Location location : arrayList) {
            sb.append(location.x).append(" ").append(location.y).append("\n");
        }
        System.out.println(sb);
    }
}
