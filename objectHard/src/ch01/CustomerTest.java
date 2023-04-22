package ch01;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerLee.setCustomerName("김유신");
        customerLee.setCustomerId(10020);
        customerLee.bonusPoint = 10000;
        System.out.println(customerLee.showCustomerInfo());
    }
}
