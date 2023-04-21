package ch14;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        // 참조할때는 클래스 이름으로 참조
        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
        System.out.println(Employee.getSerialNum());
    }
}
