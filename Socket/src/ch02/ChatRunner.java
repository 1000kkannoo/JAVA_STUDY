package ch02;

import java.io.*;
import java.net.Socket;

public class ChatRunner extends Thread {

    private boolean flag = false;
    private Socket socket;
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    public void sendMessage(String message) throws IOException {
        bw.write(message + "\n");

        bw.flush();
    }

    public ChatRunner(Socket socket) throws IOException {
        this.socket = socket;
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    @Override
    public void run() {
        while (!flag) {
            try {
                String message = br.readLine();

                if (message != null && !message.equals("")) {
                    ChatServer.room.sendMessageAll(message);
                }
                else {
                    this.flag = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ChatServer.room.removeChatRunner(this);
        try {
            br.close();
            bw.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return socket.toString();
    }
}
