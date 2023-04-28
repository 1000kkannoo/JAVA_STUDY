package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {
        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip");
             FileOutputStream fos = new FileOutputStream("copy.zip")) {
            millisecond = System.currentTimeMillis();

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일 복사하는데 " + millisecond + " 소요되었습니다.");
    }
}
