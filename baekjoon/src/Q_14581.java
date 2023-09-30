import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14581 {
    private static final String FAN = ":fan:";

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id = ":" + br.readLine() + ":";

        System.out.println(makeFan(sb, id));
    }

    private static StringBuilder makeFan(StringBuilder sb, String id) {
        return sb.append(FAN + FAN + FAN).append("\n")
                .append(FAN + id + FAN).append("\n")
                .append(FAN + FAN + FAN).append("\n");
    }
}
