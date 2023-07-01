import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("ChongChong", true);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name1 = st.nextToken();
            String name2 = st.nextToken();
            if (map.containsKey(name1)) map.put(name2, true);
            else if (map.containsKey(name2)) map.put(name1, true);
        }

        System.out.println(map.size());
    }
}
