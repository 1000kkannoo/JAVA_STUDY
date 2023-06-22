import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) sum -= stack.pop();
            else sum += stack.push(num);
        }

        System.out.println(sum);
    }
}
