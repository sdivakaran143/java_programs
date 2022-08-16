import java.util.*;
class sum_the_pos_of_the_digit_without_vowels{
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
    System.out.print("Enter the String : ");
    String str=in.nextLine().toUpperCase();
    String v="AEIOU";
    int sum=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(v.contains(Character.toString(ch))){
           continue; 
        }
        sum+=(ch-64);
    }
    System.out.println("OutPut : "+sum);
    }

}