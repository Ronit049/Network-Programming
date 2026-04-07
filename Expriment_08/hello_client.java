import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class hello_client {
public static void main(String[] args) throws Exception {
String message = "Hello, world!";
byte[] buffer = message.getBytes();
InetAddress address = InetAddress.getByName("localhost");
DatagramSocket socket = new DatagramSocket();
DatagramPacket packet = new DatagramPacket(
buffer,
buffer.length,
address,
1234
);
socket.send(packet);
System.out.println("Message sent.");
socket.close();
}
}