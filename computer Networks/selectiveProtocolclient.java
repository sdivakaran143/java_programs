import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class selectiveProtocolclient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s=new Socket("localhost",9898);
        DataInputStream dis =new DataInputStream(s.getInputStream());
        DataOutputStream dos =new DataOutputStream(s.getOutputStream());
        Random rand=new Random();
        int len =dis.read();
        int arr[]=new int[len]; 
        int ran =rand.nextInt(len);
        for (int i = 0; i < len; i++) {
            arr[i]=dis.read();
            if(i==ran)arr[i]=-1;
            System.out.println("recived =>"+arr[i]);
        }
        dos.write(ran);
        arr[ran]=dis.read();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("number of packets recived : "+arr.length);
    }
}
