package ch01;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        // 셋다 동일한 결과
        // getMaterial()을 material을 반환하는데, 이는 객체의 주소값을 반환하지만
        // 반환하는 과정에서 toString()을 하고, toString이 override가 되었기에
        // 동일한 결과가 나오는 것임.
        System.out.println(powderPrinter.getMaterial());
        System.out.println(powderPrinter.toString());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.setMaterial(new Water());
        System.out.println(waterPrinter);
    }
}
