import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) arrayList.add(sc.nextInt());

        System.out.println(solution(arrayList));
    }

    private static StringBuilder solution(ArrayList<Integer> arrayList) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(arrayList);
        for (int num : arrayList) sb.append(num).append("\n");
        return sb;
    }
}
