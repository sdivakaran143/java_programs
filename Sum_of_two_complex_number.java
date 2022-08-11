/*
 * to find the sum of the two complex number
 */

import java.util.*;
public class Sum_of_two_complex_number {
	double real;
	double imaginary;
	
	Sum_of_two_complex_number(){}
	Sum_of_two_complex_number(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public static Sum_of_two_complex_number add(Sum_of_two_complex_number v1,Sum_of_two_complex_number v2) {
		Sum_of_two_complex_number ans =new Sum_of_two_complex_number();
		ans.real=v1.real+v2.real;
		ans.imaginary=v1.imaginary+v2.imaginary;
		return ans;
	}
	

	public static void main(String[] args) {
		try(Scanner in =new Scanner(System.in)){
			Sum_of_two_complex_number v1 =new Sum_of_two_complex_number();
			Sum_of_two_complex_number v2 =new Sum_of_two_complex_number();

			System.out.print("enter the value 1 of  real : ");
			v1.real=in.nextDouble();
			System.out.print("enter the value 1 of  img : ");
			v1.imaginary=in.nextDouble();
			
			
			System.out.print("enter the value 2 of  real : ");
			v2.real=in.nextDouble();
			System.out.print("enter the value 2 of  img : ");
			v2.imaginary=in.nextDouble();
			
			Sum_of_two_complex_number answer=add(v1,v2);
			System.out.print("the sum of two cmplex numbers are : "+answer.real+" + "+answer.imaginary+"i");
		}
	}

}
