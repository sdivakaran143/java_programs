/**
 * Most Frequent Digit

You need to find which digit occurs most number of times across the four given input
numbers.

The prototype of the function is:
public static void MostFrequentDigit(int input1, int input2, int input3, int input4) {

}
Where,
input1, input2, input3, and input4 are the four given input numbers.
The function is expected to find the most frequent digit and place the result in
the class variable output1.

Example 1:
If the input1 = 123, input2 = 234, input3 = 345, input4 = 673
We see that across these four numbers,
1, 5, 6 and 7 occur once,
2 and 4 occur twice and
3 occurs four times.
Therefore, 3 is the most frequent digit and hence output1 = 3
Note: If more than a digit occurs the same number of most times, then the
highest of these digits should be the result. Below example illustrates this.
 * 
 */
import java.util.*;
public class Most_frequent_digit {
	static HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();

	public static void Frequent(int input1) {
		  String str=Integer.toString(input1);
		  int n=str.length();int cr,c;
		  for(int i=0;i<n;i++) {
				 cr=str.charAt(i)-'0';
				 try{
					 if(occ.get(cr)>=0) {
					  continue;
					 }
				 }
				 catch(Exception e){
					 occ.put(cr,0);
				 }
			}
			 for(int i=0;i<n;i++) {
				 c=1;
				 cr=str.charAt(i)-'0';

				if(occ.get(cr)>=1) {
					c=(occ.get(cr))+1;
				 }
				occ.put(cr,c);
			 }	 		 
	}
	public static void MostFrequentDigit(int input1,int input2,int input3,int input4) {
		Frequent(input1);
		Frequent(input2);
		Frequent(input3);
		Frequent(input4);
		occ.put(0,0);
		int max=0 ;
		for (Integer i : occ.keySet()) {
			 if(occ.get(max)<occ.get(i)){
				 max=i;
				} }
		System.out.println(max+" occurs maximum times "+occ.get(max));
	}
	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("enter the value 1:");
			int input1=in.nextInt();
			
			System.out.print("enter the value 2:");
			int input2=in.nextInt();
			
			System.out.print("enter the value 3:");
			int input3=in.nextInt();
			
			System.out.print("enter the value 4:");
			int input4=in.nextInt();
			
			MostFrequentDigit(input1,input2,input3,input4); 
			
			
		}
	}
}