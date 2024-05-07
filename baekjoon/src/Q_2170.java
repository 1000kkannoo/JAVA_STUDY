import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2170 {
    static class Location {
        private final int x;
        private final int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Location[] locations = new Location[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            locations[i] = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(locations, (s1, s2) -> s1.getX() - s2.getX());

        int minX = locations[0].getX(), maxY = locations[0].getY();

        int answer = 0;
        for (int i = 1; i < locations.length; i++) {
            Location location = locations[i];
            if (maxY > location.getX() && maxY >= location.getY()) continue;
            if (maxY > location.getX() && location.getY() > maxY) maxY = location.getY();
            else {
                answer += (maxY - minX);
                minX = location.getX();
                maxY = location.getY();
            }
        }

        answer += (maxY - minX);

        System.out.println(answer);
    }
}
