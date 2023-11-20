import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_30684 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            String name = br.readLine();
            if (name.length() == 3) {
                list.add(name);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
