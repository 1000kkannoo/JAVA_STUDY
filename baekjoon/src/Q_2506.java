import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_2506 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int sum = 0;
        Stack<String> stack = new Stack<>();
        for (String s : split) {
            if (s.equals("0")) {
                stack.clear();
            } else {
                stack.push(s);
                sum += stack.size();
            }
        }

        System.out.println(sum);
    }
}
