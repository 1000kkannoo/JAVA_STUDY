import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_1620_복습 {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            numMap.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            try {
                int num = Integer.parseInt(command);
                sb.append(numMap.get(num)).append("\n");
            } catch (Exception e) {
                sb.append(nameMap.get(command)).append("\n");
            }
        }


        System.out.println(sb);

    }
}
