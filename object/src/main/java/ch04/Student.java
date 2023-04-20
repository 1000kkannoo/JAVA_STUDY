package ch04;

public class Student {
    // 멤버변수 또는 인스턴스 변수라고 함
    int studentId;
    String studentName;
    String studentAddress;

    public void showStudentInfo() {
        System.out.println(studentName + ", " + studentAddress);
    }

    public String getStudentName() {
        return studentName;
    }
}
