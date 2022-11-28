import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class sockserver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("Client connected......");
        InputStreamReader inp =new InputStreamReader(s.getInputStream());
        while(true){
            BufferedReader in= new BufferedReader(inp);
            String i=in.readLine();
            if(i.equals("exit")){
                System.out.println("client left ......");
                break;
            }
            System.out.println("client : "+i);
        }
    }
}
