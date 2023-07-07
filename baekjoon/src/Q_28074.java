import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_28074 {
    public static void main(String[] args) throws IOException {
        boolean isMobis = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] mobis = {"M", "O", "B", "I", "S"};
        String str = br.readLine();
        for (String st : mobis) {
            if (!str.contains(st)) {
                isMobis = false;
                break;
            }
        }

        System.out.println(isMobis ? "YES" : "NO");
    }
}
