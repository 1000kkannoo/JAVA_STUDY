import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();
            if (cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (cmd.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (cmd.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (cmd.equals("empty")) {
                sb.append((stack.isEmpty() ? 1 : 0)).append("\n");
            } else {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.print(sb);
    }
}
