import  java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        DataInputStream in = new DataInputStream(s.getInputStream()); // принимать сообщение
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("Привет");
        String m = in.readUTF();
        System.out.println(m);
        s.close();
        in.close();
        out.close();

    }
}


