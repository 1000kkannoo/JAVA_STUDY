import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q_7785_복습 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken(), command = st.nextToken();
            if (command.equals("enter")) {
                set.add(name);
                continue;
            }
            set.remove(name);
        }


        while (!set.isEmpty()) {
            sb.append(set.pollLast()).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
