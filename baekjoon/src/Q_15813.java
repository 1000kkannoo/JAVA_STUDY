import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_15813 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int sum = 0;
        for (char c : name.toCharArray()) {
            sum += (int) c - 64;
        }
        
        System.out.println(sum);
    }
}
