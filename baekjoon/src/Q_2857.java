import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2857 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 5; i++) {
            boolean isFBI = br.readLine().contains("FBI");
            if (isFBI) sb.append(i).append(" ");
        }

        if (sb.length() == 0) System.out.println("HE GOT AWAY!");
        else System.out.print(sb);
    }
}
