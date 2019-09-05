
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static  void main (String[] args) throws IOException {
        ServerSocket ServerSocket = new ServerSocket(1234);
        System.out.println("Сервер запущен");
        while (true){
            Socket client = ServerSocket.accept(); // ожидание подключения к сокету
            //Socket s = new Socket("localhost",1234);
            DataInputStream in = new DataInputStream(client.getInputStream()); // принимать сообщение
            DataOutputStream out = new DataOutputStream(client.getOutputStream()); // отправлять сообщение
            String message = in.readUTF(); // сервер ждет получение данных от клиента
            out.writeUTF(message);
            in.close(); // закрываем поток
            out.close(); // закрываем поток
            client.close(); //закрываем поток

        }
    }

    private static Socket accept() {
        return null;
    }

}
