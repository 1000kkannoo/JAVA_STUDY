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

        // 참조변수를 통해 클래스 static method 로 클래스 변수의 값을 변경
        // employeeKim.setSerialNum(101);
        // System.out.println(Employee.getSerialNum());

    }
}
