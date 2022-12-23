import java.util.*;
public class harerRanKprogram {
static Scanner in =new Scanner(System.in);
    
    public static String convert(String a){
        if(a.length()<4){
            if(a.length()==2){
                a="0"+a;
            }
            if(a.length()==1){
                a="00"+a;
            }
            if(a.length()==0){
                a="000"+a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int in1=in.nextInt();
        int in2=in.nextInt();
        int in3=in.nextInt();
        
        String  a=""+in1;
        String  b=""+in2;
        String  c=""+in3;
        
        a=convert(a);
        b=convert(b);
        c=convert(c);
        int sum1=(a.charAt(0)-'0')+(b.charAt(0)-'0')+(c.charAt(0)-'0');
        int sum2=(a.charAt(1)-'0')+(b.charAt(1)-'0')+(c.charAt(1)-'0');
        int sum3=(a.charAt(2)-'0')+(b.charAt(2)-'0')+(c.charAt(2)-'0');
        System.out.println(sum3);
        System.out.println(sum2);
        System.out.println(sum1);

    }
}  