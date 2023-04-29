package level1;

public class 음양더하기 {

    public static void main(String[] args) {
        int[] test = {4,7,12};
        boolean[] test2 = {true,false,true};
        System.out.println(solution(test,test2));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return sum;
    }
}
