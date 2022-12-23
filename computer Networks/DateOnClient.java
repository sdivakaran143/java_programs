import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DateOnClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s=new Socket("localhost",9929);
        System.out.println("your now connected ......");
        InputStreamReader isr =new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(isr);
        System.out.println(bf.readLine());
    }   
}
