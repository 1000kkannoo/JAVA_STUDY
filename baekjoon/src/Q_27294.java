import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_27294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int time = Integer.parseInt(st.nextToken());
        int launch = Integer.parseInt(st.nextToken());

        if(launch == 1 || time <= 11 || time > 16) System.out.println("280");
        else if(launch == 0) System.out.println("320");
    }
}