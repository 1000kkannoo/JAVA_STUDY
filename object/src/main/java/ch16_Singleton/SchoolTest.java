package ch16_Singleton;

public class SchoolTest {

    public static void main(String[] args) {
        School school1 = School.getInstance();
        School school2 = School.getInstance();

        System.out.println(school1 == school2); // true
        System.out.println(school1.toString()); // school1과 school2는 동일한 주소
        System.out.println(school2.toString());
    }
}
