import java.util.*;

public class test {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
        // String str ="ggeekss";
		// System.out.println(str+"\n");
		// for(int i=0;i<str.length()/2;i++,System.out.println()){
		//     str=str.substring(0,i)+""+str.substring(i+1,(str.length()-1)-i)+""+str.substring(((str.length())-i));
		//    System.out.println(str);
		// }
		// String s = new String("GeeksforGeeks");
		// char arr[]=s.toCharArray();
		// Arrays.sort(arr);
		// s=new String(arr);
		// System.out.println(s);
		int n=10;
		n=n%2==0?n-1:n;
		for(int i=0;i<n;i++,System.out.println()){
			for(int j=0;j<n;j++){
				if((i+j==n-1||i==j||i==0||j==n-1||i==n-1||j==0)&&!(i==(n-1)/2&&j==(n-1)/2)){
				// if((i+j==n-1)&&!(i==(n-1)/2&&j==(n-1)/2)){
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
		}

    }

}
