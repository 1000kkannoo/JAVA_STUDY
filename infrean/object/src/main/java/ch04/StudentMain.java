package ch04;

public class StudentMain {

    public static void main(String[] args) {

        // 참조변수 = new를 이용한 인스턴스 생성
        Student studentLee = new Student(100, "Lee");
        studentLee.studentAddress = "Seoul";

        Student studentKim = new Student(101, "Kim", "New York");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        // 같은 메서드이지만 오버로딩으로 인해 다르게 동작 !
        studentKim.showStudentInfo("저는 뉴욕에 살고있습니다.");

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
