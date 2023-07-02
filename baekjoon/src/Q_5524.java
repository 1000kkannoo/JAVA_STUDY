import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5524 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String name = br.readLine();
            sb.append(name.toLowerCase()).append("\n");
        }

        System.out.println(sb);
    }
}
