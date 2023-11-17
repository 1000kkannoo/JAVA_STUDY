import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class Q_30087 {
    private static final Map<String, String> answer = Map.of(
            "Algorithm", "204",
            "DataAnalysis", "207",
            "ArtificialIntelligence", "302",
            "CyberSecurity", "B101",
            "Network", "303",
            "Startup", "501",
            "TestStrategy", "105"
    );

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String key = br.readLine();
            sb.append(answer.get(key)).append("\n");
        }

        System.out.println(sb);
    }
}
