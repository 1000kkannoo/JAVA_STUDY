import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5554 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int secondTime = 0;
        for (int i = 0; i < 4; i++) {
            secondTime += Integer.parseInt(br.readLine());
        }

        System.out.println(getMinuteTime(secondTime));
    }

    private static StringBuilder getMinuteTime(int secondTime) {
        return new StringBuilder()
                .append(secondTime / 60)
                .append("\n")
                .append(secondTime % 60);
    }
}
