import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateFromServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9929);
        System.out.println("waiting for connection ......");
        Socket s=ss.accept();
        System.out.println("client connected.....");
        PrintWriter ptr=new PrintWriter(s.getOutputStream());
        ptr.println("server Date "+(new Date()));
        ptr.flush();
    }
}
