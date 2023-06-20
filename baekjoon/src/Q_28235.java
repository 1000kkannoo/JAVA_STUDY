import java.util.HashMap;
import java.util.Scanner;

public class Q_28235 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("SONGDO", "HIGHSCHOOL");
        hashMap.put("CODE", "MASTER");
        hashMap.put("2023", "0611");
        hashMap.put("ALGORITHM", "CONTEST");

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(hashMap.get(st));
    }
}
