import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String JaHwan = br.readLine();
        String doctor = br.readLine();

        String answer = (JaHwan.length() >= doctor.length()) ? "go" : "no";

        System.out.println(answer);
    }
}
