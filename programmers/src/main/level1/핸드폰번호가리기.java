package main.level1;

public class 핸드폰번호가리기 {

    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String[] phoneNumberArray = phone_number.split("");
        int start = phoneNumberArray.length - 5;
        for (int i = start; 0 <= i; i-- ) {
            phoneNumberArray[i] = "*";
        }
        return String.join("",phoneNumberArray);
        // 정규식 공부해보기
    }
}
