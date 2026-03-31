import java.net.*;
import java.io.*;
public class HelloClient {
public static void main(String[] args) throws Exception {
Socket socket = new Socket("127.0.0.1", 8080);
OutputStream out = socket.getOutputStream();
out.write("Hello, world!".getBytes());
socket.close();
}
}