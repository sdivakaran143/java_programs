import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class stopandwait{
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s=new Socket("localhost",9999);
        System.out.println("you are connected.....");
        PrintWriter ptr =new PrintWriter(s.getOutputStream());
        InputStreamReader inps=new InputStreamReader(s.getInputStream());
        for (int i = 0; i <=5; i++) {
            if(i==5){
                ptr.println("exit");
                ptr.flush();
                break;
            }
            ptr.println(i);
            ptr.flush();
            BufferedReader br=new BufferedReader(inps);
            String ack=br.readLine();
            if(ack.equals("recived")){
                System.err.println("ack recived for "+i);
                Thread.sleep(3000);
            }
        }
    }
}