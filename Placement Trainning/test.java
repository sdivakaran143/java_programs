import java.util.*;

public class test {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
        String str ="geekss";
		System.out.println(str+"\n");
		for(int i=0;i<str.length()/2;i++,System.out.println()){
		    str=str.substring(0,i)+"*"+str.substring(i+1,(str.length()-1)-i)+"*"+str.substring(((str.length())-i));
		   System.out.println(str);
		}
    }
}
