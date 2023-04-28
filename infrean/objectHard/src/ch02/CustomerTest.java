package ch02;

public class CustomerTest {

    public static void main(String[] args) {
/*        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());*/

        // 묵시적 형변환
        Customer customerKim = new VIPCustomer(10020,"김유신");
        customerKim.bonusPoint = 10000;

        VIPCustomer customerKang = new VIPCustomer(10030,"강감찬");
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKang.showCustomerInfo());
    }
}
