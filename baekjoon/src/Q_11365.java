import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String word = br.readLine();
            if (word.equals("END")) break;
            String reverse = new StringBuilder(word).reverse().toString();
            sb.append(reverse).append("\n");
        }
        System.out.println(sb);
    }
}
