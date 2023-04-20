package ch08;

public class LocalVariableType {

    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        // str = 3; <- 한번 정해진 자료형은 다른 자료형으로 대입불가
        System.out.println(str);
    }
}
