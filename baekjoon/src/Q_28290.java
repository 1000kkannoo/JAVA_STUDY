import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_28290 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fun = br.readLine();

        if (fun.equals("fdsajkl;") || fun.equals("jkl;fdsa")) {
            System.out.println("in-out");
        } else if (fun.equals("asdf;lkj") || fun.equals(";lkjasdf")) {
            System.out.println("out-in");
        } else if (fun.equals("asdfjkl;")) {
            System.out.println("stairs");
        } else if (fun.equals(";lkjfdsa")) {
            System.out.println("reverse");
        } else {
            System.out.println("molu");
        }
    }
}
