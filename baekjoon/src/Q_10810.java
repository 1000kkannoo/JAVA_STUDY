import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_10810 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splitA = br.readLine().split(" ");
        String[] splitB = br.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 0);
        for (int i = 0; i < 10; i++) {
            int numA = Integer.parseInt(splitA[i]);
            int numB = Integer.parseInt(splitB[i]);
            if (numA > numB) {
                map.put("A", map.get("A") + 1);
            } else if (numB > numA) {
                map.put("B", map.get("B") + 1);
            }
        }

        if (map.get("A").equals(map.get("B"))) {
            System.out.println("D");
        } else {
            if (map.get("A") > map.get("B")) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
