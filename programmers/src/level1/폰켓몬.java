package level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }

    public static int solution(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        return Math.min(nums.length / 2, numSet.size());
    }
}
