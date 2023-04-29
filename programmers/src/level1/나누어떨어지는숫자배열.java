package level1;

import java.util.ArrayList;
import java.util.List;

public class 나누어떨어지는숫자배열 {

    public static void main(String[] args) {
        int[] a = {1,2,3,36};
        System.out.println(solution(a, 1));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> numList = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                numList.add(j);
            }
        }
        if (numList.isEmpty()){
            numList.add(-1);
        }
        return numList.stream().sorted().mapToInt(i -> i).toArray();
    }
}
