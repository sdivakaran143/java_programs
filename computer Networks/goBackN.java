import java.io.*;
import java.util.*;
public class goBackN {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the Window Size: ");
        int window = in.nextInt();
        boolean loop = true;
        int sent = 0;
        while (loop) {
            for (int i = 0; i < window; i++) {
                System.out.println("Frame " + sent + " has been transmitted.");
                sent++;
                if (sent == window)
                    break;
            }
            System.out.println("Please enter the last Acknowledgement received.");
            int ack = in.nextInt();
            if (ack == window){
                System.out.println("exited....");
                loop = false;}
            else
                sent = ack;
        }
    }
}