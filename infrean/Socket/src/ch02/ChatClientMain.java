package ch02;

import java.io.IOException;

public class ChatClientMain {

    public static void main(String[] args) throws IOException {
        ChatClient client;
        String nickname = "kevinDb";
        client = new ChatClient(nickname,"localhost",30000);
        client.setSize(300,200);
        client.setTitle("ManCity");
        client.setVisible(true);
    }
}
