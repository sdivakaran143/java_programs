import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.*;

public class Udpclient{
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        InetAddress ia=InetAddress.getLocalHost();
        System.out.println("connected.....");
       while(true){
        String str=in.nextLine();
        byte[] by=str.getBytes();
        DatagramPacket dp=new DatagramPacket(by,by.length,ia,9999);
        ds.send(dp);
        if(str.equals("exit")){
            System.out.println("exited....");
            break;
        }
       }

        // byte[] by1=new byte[1024];
        // DatagramPacket dp1=new DatagramPacket(by1, by1.length);
        // ds.receive(dp1);
        // String str =new String(dp1.getData());
        // System.out.println(str);

    }
}