import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q_1159 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        while (n --> 0) {
            String name = br.readLine();
            map.put(name.charAt(0), map.getOrDefault(name.charAt(0), 0) + 1);
        }

        for (char key : map.keySet()) {
            int count = map.get(key);
            if (count >= 5) {
                sb.append(key);
            }
        }

        if (sb.length() == 0) System.out.println("PREDAJA");
        else System.out.println(sb);
    }
}
