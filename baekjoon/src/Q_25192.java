import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        HashMap<String, Boolean> map = new HashMap<>();

        int count = 0;
        while (T-- > 0) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                map.clear();
            } else {
                if (!map.containsKey(str)) {
                    map.put(str, true);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
