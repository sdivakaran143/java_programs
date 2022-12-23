import java.util.*;
import java.io.*;
import java.net.*;
public class sockclient {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",9999);
        PrintWriter ptr =new PrintWriter(s.getOutputStream());
        System.out.println("you connected.....\n Start typing....");
        while(true){
            String m=in.nextLine();
            if(m.equals("exit")){
                ptr.println(m);
                ptr.flush();
                break;
            }
            ptr.println(m);
            ptr.flush();
        }
        System.out.println("exited.....");
    }
}
