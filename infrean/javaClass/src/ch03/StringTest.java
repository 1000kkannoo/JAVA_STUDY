package ch03;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // false

        // 상수풀에 있는 것들의 주소를 가리키게 함
        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // true

    }
}
