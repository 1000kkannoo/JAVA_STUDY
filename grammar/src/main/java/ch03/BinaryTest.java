package ch03;

public class BinaryTest {

    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

        int cNum = 0b01000001;

        System.out.println((char) cNum);
    }
}
