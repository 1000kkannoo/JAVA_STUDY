package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
