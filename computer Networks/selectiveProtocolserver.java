import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class selectiveProtocolserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9898);
        System.out.println("waiting for client .....");
        Socket s=ss.accept();
        System.out.println("client connected .....");
        DataInputStream dis =new DataInputStream(s.getInputStream());
        DataOutputStream dos =new DataOutputStream(s.getOutputStream());
        
        int arr[] = { 10, 20, 30, 40, 50 };
        dos.write(arr.length);
        for (int i = 0; i < arr.length; i++) {
            dos.write(arr[i]);
            dos.flush();
        }
        int g=dis.read();
        dos.write(arr[g]);
       dos.flush();
       System.out.println("number of packets send : "+arr.length);
    }
}
