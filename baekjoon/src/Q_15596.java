public class Q_15596 {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,3,5}));
    }

    public static long sum(int[] a) {
        long ans = 0;
        for (int num : a) {
            ans += num;
        }
        return ans;
    }
}
