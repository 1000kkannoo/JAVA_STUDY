package ch01;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.serMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.serMaterial(new Plastic());
        System.out.println(plasticPrinter);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.serMaterial(new Water());
        System.out.println(waterPrinter);
    }
}
