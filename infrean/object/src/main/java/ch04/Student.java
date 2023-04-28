package ch04;

public class Student {
    // 멤버변수 또는 인스턴스 변수라고 함
    int studentId;
    String studentName;
    String studentAddress;

    // 기본 생성자, 작성하지 않아도 컴파일러 단계에서 만들어줌
    // 클래스에 하나도 생성자가 없을 경우에만 생김
    // public Student() {}

    // this 없이 생성자를 만들 수 있지만, 대게의 코딩컨벤션을 따름.

    // 이름은 같고 매개변수가 다른, 하나 이상의 메서드가 있는 것을 오버로딩이라고함.
    // 생성자도 오버로딩이 가능함
    public Student() {}

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public void showStudentInfo() {
        System.out.println(studentId + ", " + studentName + ", " + studentAddress);
    }

    public void showStudentInfo(String note) {
        System.out.println(studentId + ", " + studentName + ", " + studentAddress + " / " + note);
    }

    public String getStudentName() {
        return studentName;
    }
}
