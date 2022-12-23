import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class stopandwaitreciver{
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss= new ServerSocket(9999);
        Socket s=ss.accept(); int frames=0;
        System.out.println("client connected.....");
        PrintWriter ptr =new PrintWriter(s.getOutputStream());
        InputStreamReader isr =new InputStreamReader(s.getInputStream());
        while(true){
            BufferedReader in= new BufferedReader(isr);
            String j=in.readLine();
            frames++; 
            if(j.equals("exit")){
                System.out.println("aks recived from client...."+(--frames));
                break;
            }
            System.out.println("recived frame  : "+j);
            Thread.sleep(1000);
            ptr.println("recived");
            ptr.flush();
            System.out.println("ack send for "+j);           
        }
       
    }
}