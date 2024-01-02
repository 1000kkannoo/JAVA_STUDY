import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11006 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            int countChickenLeg = Integer.parseInt(split[0]);
            int goodChicken = Integer.parseInt(split[1]);
            int realChickenLeg = goodChicken * 2;

            int errorChicken = realChickenLeg - countChickenLeg;
            sb.append(errorChicken).append(" ").append(goodChicken - errorChicken).append("\n");
        }

        System.out.println(sb);
    }
}
