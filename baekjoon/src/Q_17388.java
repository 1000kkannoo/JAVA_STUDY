import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Character, Integer> map = new HashMap<>();

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int sum = s + k + h;

        if (sum >= 100) System.out.println("OK");
        else {
            if (s > k) {
                if (k > h) System.out.println("Hanyang");
                else System.out.println("Korea");
            } else {
                if (s > h) System.out.println("Hanyang");
                else System.out.println("Soongsil");
            }
        }

    }
}
