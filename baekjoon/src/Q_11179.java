import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11179 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String binaryString = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        System.out.println(Integer.parseInt(binaryString, 2));
    }
}
