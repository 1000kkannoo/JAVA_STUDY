package ch01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(50000);

            System.out.println(50000 + " Port Echo Server Running...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(new Date().toString() + ":" + socket.toString());
                System.out.println(socket.getLocalPort());
                System.out.println(socket.getPort());

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String str = br.readLine();

                bw.write(str + " 1\n");
                bw.flush();
                bw.write(str + " 2\n");
                bw.flush();
                bw.write(str + " 3\n");
                bw.flush();

                bw.close();
                br.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
