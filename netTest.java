import java.io.IOException;
import java.net.*;

public class netTest {
    public static void main(String[] args) throws IOException {
       
        DatagramSocket socket = new DatagramSocket(5678);

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // Receive
        socket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println(message);

        // Close connection
        socket.close();
    }
}
