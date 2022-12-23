import java.util.*;
public class the_given_input_is_fibonacci_or_not_2 {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("ENter the number check :");
        int n=in.nextInt();
        String[] val=Double.toString(Math.sqrt(5*(n*n)-4)).split("[.]");
        System.out.println("Output : "+val[1].equals("0"));
    }
}