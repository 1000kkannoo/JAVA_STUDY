package ch07;

public class CharacterTest {

    public static void main(String[] args) {

        char ch1 = 'A';
        // char ch = "A";
        // 큰따옴표는 문자열임
        // 작은따옴표는 문자 하나임

        System.out.println(ch1);
        System.out.println((int) ch1);

        // 숫자를 변수이름에 넣는건 좋은 네이밍 기법은 아님
        char ch2 = 66;
        System.out.println(ch2);
        // System.out.println((int) ch2);

        char ch3 = '한';
        char ch4 = '\uD55c'; // 유니코드이용
        char ch5 = '\uAC00';

        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);

    }
}
