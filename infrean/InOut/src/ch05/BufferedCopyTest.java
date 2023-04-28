package ch05;

import java.io.*;
import java.net.Socket;

public class BufferedCopyTest {

    public static void main(String[] args) throws IOException {
        long millisecond = 0;

        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream("a.zip"));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
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

        Socket socket = new Socket();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        br.readLine();
    }
}
