import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_27889 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String schoolName = br.readLine();

        if (schoolName.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        } else if (schoolName.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (schoolName.equals("KIS")) {
            System.out.println("Korea International School");
        } else {
            System.out.println("St. Johnsbury Academy");
        }
    }
}
