/*
 * substring program
enter the string : Programming
enter the count : 3
Pro
rog
ogr
gra
ram
amm
mmi
min
ing
 */
import java.util.Scanner;

public class substring_the_string_by_user_count {
	static Scanner in =new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("enter the string : ");
		String str =in.nextLine();
		System.out.print("enter the count : ");
		int n =in.nextInt();

	for(int i=0;i<str.length()-(n-1);i++){
		System.out.print(str.substring(i,i+n)+"\n");
	}
	}

}
