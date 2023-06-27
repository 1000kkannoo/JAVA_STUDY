import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_7785 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String record = st.nextToken();
            if (record.equals("enter")) set.add(name);
            else set.remove(name);
        }

        while (!set.isEmpty()) {
            sb.append(set.pollLast()).append("\n");
        }

        System.out.println(sb);
    }
}
