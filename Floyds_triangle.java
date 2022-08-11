import java.util.Scanner;
/*
 * Floyd& Triangle.
 * 
 */
public class Floyds_triangle {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("enter the  rows: ");
			int num =in.nextInt();
			int count =num;
			int k=1;
			for(int i=1;i<=count;i++){
				for(int j=0;j<i;j++){
					System.out.print(k+"\t");
					k++;
				}
				System.out.println();
			}
		}	
	}

}

