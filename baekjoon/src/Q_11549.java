import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11549 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(br.readLine());
        int[] numbers = getNumbers(br);
        System.out.println(solution(type, numbers));
    }

    private static int solution(int type, int[] numbers) {
        int answer = 0;
        for (int number : numbers) {
            if (type == number) {
                answer++;
            }
        }
        return answer;
    }

    private static int[] getNumbers(BufferedReader br) throws Exception {
        String[] split = br.readLine().split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        return arr;
    }
}
