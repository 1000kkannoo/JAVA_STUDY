package ch02;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student Lee = new Student(100, "Lee");
        Student Lee2 = Lee;
        Student shun = new Student(100, "Lee");

        Student Lees = (Student) Lee.clone();

        System.out.println(Lees.toString());
        /*
        System.out.println(Lee.hashCode());
        System.out.println(shun.hashCode());
        System.identityHashCode(Lee); // hashCode 를 오버라이딩 했을때 진짜 hashCode 를 보기위한 코드
        System.identityHashCode(shun);

        System.out.println(Lee.equals(Lee2)); // true
        System.out.println(Lee == Lee2); // true

        System.out.println(Lee.equals(shun));
        System.out.println(Lee == shun);

        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode()); // 같은 해쉬코드 -> equals를 오버라이딩 했다면 hashCode도 오버라이딩 해야함
        System.out.println(str2.hashCode()); // 같은 해쉬코드

        */
    }
}
