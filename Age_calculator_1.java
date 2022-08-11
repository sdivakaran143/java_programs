import java.util.Scanner;
/**
 * age calculator
 */
public class Age_calculator_1 {

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			System.out.print("Enter your birth date :");
			int d1=in.nextInt();
			System.out.print("Enter your birth month :");
			int m1=in.nextInt();
			System.out.print("Enter your birth year :");
			int y1=in.nextInt();
			System.out.println();
			System.out.print("Enter today  date :");
			int d2=in.nextInt();
			System.out.print("Enter this  month :");
			int m2=in.nextInt();
			System.out.print("Enter curent  year :");
			int y2=in.nextInt();
			for(int i=y1;i<=y2;i++) {
				if(i%400==0 && m1<=2 ) {
					d1++;
				    }
				    else if(i%400==0 && m1<=2) {
				    	d1++;

				    }else if(i%4==0 && m1<=2) {
				    	d1++;
				    }
				}
			if(d2<d1){
				d2+=30;
				m2--;
			}
			if(m2<m1){
				m2+=12;
				y2--;
			}

			int d3=d2-d1;
			int m3=m2-m1;
			int y3=y2-y1;
			System.out.println("\nyour are :\n  "+d3+" days , "+m3+" months , "+y3+" years old");

			
		}

	}

}
