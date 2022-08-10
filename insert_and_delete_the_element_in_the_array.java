/*
 * insert and delete the element in array
 */
import java.util.Scanner;

public class insert_and_delete_the_element_in_the_array {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("\nenter the size for array : ");

				int n=in.nextInt();
				int[] arr=new int[1000];
				
				System.out.print("\nenter the value for array \n");
				for(int i=0;i<n;i++){
					arr[i]=in.nextInt();
				}
				
				for(;;) {
					System.out.print("\nenter 1 to insert \nEnter 2 to delete \npress any key to exit : ");
				int choice=in.nextInt();
				
				if(choice==1) {
				System.out.print("\nenter the value to insert : ");
				int val=in.nextInt();
				
				System.out.print("\nenter the postion of value to insert : ");
				int pos=in.nextInt();
				n++;
				while(pos>n) {
					System.out.println("invalid enter again");
					pos=in.nextInt();
				}
				for(int i=n;i>pos-1;i--) {
					arr[i+1]=arr[i];
				}
				
				arr[pos]=val;
				
				
				for(int i=0;i<n;i++) {
					System.out.print("\t"+arr[i]);
				} 
				
				}
				else if(choice==2){
					System.out.print("\nenter the index value to delete : ");
					int index=in.nextInt();
					while(index>=n) {
						System.out.println("invalid enter or no values at the array try again after insertion");
						break;
					}
					
					for(int i=index;i<n;i++) {
						arr[i]=arr[i+1];
					}
					n--;
					
					for(int i=0;i<n;i++) {
						System.out.print("\t"+arr[i]);
					} 
					
				}
				else {
					break;
				}
				}
		}
			

	}
}
