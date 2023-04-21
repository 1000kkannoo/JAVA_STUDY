package ch14;

public class Employee {

    // static 은 프로그램이 로드 될때 생성됨
    // static 변수는 클래스 변수라고도함
    private static int serialNum = 1000;

    private int employeeId;

    private String employeeName;
    private String department;
    public Employee() {
        employeeId = serialNum++;
    }

    public static int getSerialNum() {
        int i = 0;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
