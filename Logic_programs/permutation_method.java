/*
 * permutation method
 */
import java.util.Random;
import java.util.Scanner;
class permutation_method{
	public static void swap(int[] a,int s) {
		Random ran =new Random();
		int rndm=ran.nextInt(1);
		int rndm1=ran.nextInt(s);
		int l;
			l=a[rndm1];
			a[rndm1]=a[rndm];
			a[rndm]=l;
	}
	public static int cmb(int[] a,int s) {
		int i=0,rev=0;
		while(i<s){
			rev=(rev*10)+a[i];
			i++;
		}
		return rev;
	}
	
	public static void main(String args[]){
		try(Scanner in= new Scanner(System.in)){
			System.out.print("enter the digit : ");
			int val=in.nextInt();
			if(val<10){
				System.out.println("\t"+val);
			}
			else {
			int[] a=new int[1000];
			int rev=0,fact=1,i=0,n=val,s=0;
			while(n>0){
				a[i]=n%10; rev=(rev*10)+a[i];
				n=n/10;i++;s++;
			}
			for(i=1;i<=s;i++) {
				fact *= i;
			}
			int[] c=new int[fact];
			c[0]=val;
			c[1]=rev;
			int ne;
			while(c[fact-1]==0) {
			swap(a,s);
			ne=cmb(a,s);
			for(int k=0;k<fact;k++) {
				if(c[k]==ne) {
					break;
				}
				else if(ne!=c[k] && c[k]==0) {
					c[k]=ne;
					break;
				}
				}
			}
			System.out.println("");
			for(int j :c) {
				System.out.println("\t"+j);
				}
			}
		}
	}
}