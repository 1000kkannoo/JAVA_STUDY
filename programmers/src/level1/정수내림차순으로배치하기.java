package level1;

public class 정수내림차순으로배치하기 {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String numString = String.valueOf(n);
        String[] numStringList = numString.split("");

        for (int i = 0; i < numStringList.length; i++) {
            for (int j = i; j < numStringList.length - 1; j++) {
                if (Integer.parseInt(numStringList[i]) < Integer.parseInt(numStringList[j + 1])) {
                    String temp = numStringList[i];
                    numStringList[i] = numStringList[j + 1];
                    numStringList[j + 1] = temp;
                }
            }
        }

        return Long.parseLong(String.join("", numStringList));
    }
}
