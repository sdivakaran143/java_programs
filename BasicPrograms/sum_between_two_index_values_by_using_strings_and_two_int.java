import java.util.*;
public class sum_between_two_index_values_by_using_strings_and_two_int {
    static Scanner in =new Scanner(System.in);
    static String str="";
    static String m="0";static int sum=0;
public static int getinput(int n){
    if(n=="0".charAt(0)-'0'){
        return "0".charAt(0)-'0';
    }if((m.charAt(0)-'0')<=5){
    String st =in.nextLine();
    str=str+" "+st;
    }
    return getinput(n-1);
}
public static int sum(int n,String[] sta,String f,String l){
    if(n==sta.length){
        return sum;
    }if(n>=(f.charAt(0)-'0')&&n<=(l.charAt(0)-'0')){
        sum+=Integer.parseInt(sta[n]);
    }
    return sum(n+1,sta,f,l);
}
    public static void main(String[] args) {
        System.out.print("enter the size :");
        String m=in.nextLine();
        System.out.print("enter the first :");
        String f=in.nextLine();
        System.out.print("enter the last :");
        String l=in.nextLine();
        getinput(m.charAt(0)-'0');
        String[] sta=str.split(" ");
        String j=""+sum(1,sta,""+((f.charAt(0)-'0')+1),""+((l.charAt(0)-'0')+1));
        System.out.println("Output : "+j);
    }
}