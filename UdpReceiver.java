import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte[] buf = new byte[256];
		
		DatagramSocket  socket = new DatagramSocket(5000);
		 
		
		DatagramPacket packet = new DatagramPacket(buf,buf.length);
		socket.receive(packet);
		System.out.println(new String(buf));
		System.out.println("데이터를 받았습니다");

	}

	
	
}


 


