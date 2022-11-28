import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds= new DatagramSocket(9999);
        while(true){
            byte[] b =new byte[1024];
            DatagramPacket dp =new DatagramPacket(b,b.length);
            ds.receive(dp);
            String str= new String(dp.getData());
            System.out.println("client :"+str);
        }
    }
}