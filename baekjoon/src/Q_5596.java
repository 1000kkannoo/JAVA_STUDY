import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5596 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = br.readLine().split(" ");
        String[] split2 = br.readLine().split(" ");

        int human1 = 0;
        int human2 = 0;

        for (int i = 0; i < 4; i++) {
            human1 += Integer.parseInt(split1[i]);
            human2 += Integer.parseInt(split2[i]);
        }

        System.out.println(Math.max(human1, human2));
    }
}
