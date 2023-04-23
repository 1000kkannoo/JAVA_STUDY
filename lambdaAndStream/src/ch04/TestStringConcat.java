package ch04;

public class TestStringConcat {
    public static void main(String[] args) {
        int num = 100;

        String s1 = "hello";
        String s2 = "world";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        StringConcat concat2 = (str1, str2) -> {
            // num은 지역변수이기에 final로 선언이 되어있음, 즉 사용불가
            // num = 200;
            // 람다식 내부는 어노니머스 내부클래스 임!
            System.out.println(str1 + "," + str2);
            System.out.println(num);
        };

        concat2.makeString(s1, s2);

        // 람다는 내부적으로 어너니머스 이너클래스로 처리가 됨
        StringConcat concat3 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
                System.out.println(num);
            }
        };

        concat3.makeString(s1,s2);
    }
}
