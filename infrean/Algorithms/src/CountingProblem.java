// 특정 수를 카운팅하는 알고리즘
public class CountingProblem {
    public static void main(String[] args) {
        int[] people = {55, 40, 27, 99, 76, 81, 29, 31, 33, 62};
        // 배열의 인덱스마다 나이대를 확인하여 counting 합니다.
        // 만약 ages[0] 값은 20대라고 가정하여서 설계를 할 수 있다.
        int[] ages = new int[10];

        for (int age : people) {
            if (age < 30) ages[0]++;
            else if (age < 40) ages[1]++;
            else if (age < 50) ages[2]++;
            else if (age < 60) ages[3]++;
            else if (age < 70) ages[4]++;
            else if (age < 80) ages[5]++;
            else if (age < 90) ages[6]++;
            else if (age < 100) ages[7]++;
        }
        System.out.println("20대 : " + ages[0] + "명 입니다.");
        System.out.println("30대 : " + ages[1] + "명 입니다.");
        System.out.println("40대 : " + ages[2] + "명 입니다.");
        System.out.println("50대 : " + ages[3] + "명 입니다.");
        System.out.println("60대 : " + ages[4] + "명 입니다.");
        System.out.println("70대 : " + ages[5] + "명 입니다.");
        System.out.println("80대 : " + ages[6] + "명 입니다.");
        System.out.println("90대 : " + ages[7] + "명 입니다.");

    }
}
