import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_29751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int w = Integer.parseInt(split[0]);
        int h = Integer.parseInt(split[1]);
        System.out.printf("%.1f", solution(w, h));
    }

    private static Double solution(int w, int h) {
        return (double) w * h / 2;
    }
}
