import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_10773_복습 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
                continue;
            }
            stack.push(n);
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        System.out.println(sum);
    }
}
