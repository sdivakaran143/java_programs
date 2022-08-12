/*
 * https://drive.google.com/file/d/1bJjMjgZeDVZn7Wc5_AwwbD2flaF6W9Hu/view?usp=sharing
 */
import java.util.*;
public class Encode_three_strings {
static Scanner in=new Scanner(System.in);
        public static String output1;
        public static String output2;
        public static String output3;
        static String arr[]=new String[3];

        static String reverse(String input){
            StringBuilder sb=new StringBuilder(input);
            input=sb.reverse().toString();
            return input;
        }
        static String viceversa(String input){
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(Character.isAlphabetic(ch)&&Character.isUpperCase(ch)){
                    input = input.substring(0, i)+Character.toLowerCase(ch)+input.substring(i + 1);
                }if(Character.isAlphabetic(ch)&&Character.isLowerCase(ch)){
                    input = input.substring(0, i)+Character.toUpperCase(ch)+input.substring(i + 1);
                }
            }
            return input;

        }
        public static void encodeStrings(String input) {
            int n=input.length();
            n=n%3;
            if(n==0){
                n=3;
            }
            arr[0]=input.substring(0,n);
            input=reverse(input);
            arr[2]=reverse(input.substring(0,n));
            char c=input.charAt(n);
            input=reverse(input);
            int lsin=input.lastIndexOf(c);
            arr[1]=input.substring(n,lsin+1);
        }
        public static void encodeThreeStrings(String input1, String input2, String input3) {
            String arr1[]=new String[3];
            String arr2[]=new String[3];
            String arr3[]=new String[3];

            encodeStrings( input1);
            for(int i=0;i<3;i++){
                arr1[i]=arr[i];
            }
            encodeStrings( input2);
            for(int i=0;i<3;i++){
                arr2[i]=arr[i];
            }
            encodeStrings( input3);
            for(int i=0;i<3;i++){
                arr3[i]=arr[i];
            }

            output1=arr1[0]+arr2[1]+arr3[2];
            output2=arr1[1]+arr2[2]+arr3[0];
            output3=arr1[2]+arr2[0]+arr3[1];
            output3=viceversa(output3);
            System.out.println(output1+"\n"+output2+"\n"+output3);
        }

        public static void main(String [] args) {
        
        System.out.print("Enter the input1 :");
        String input1=in.nextLine();
        System.out.print("Enter the input2 :");
        String input2=in.nextLine();
        System.out.print("Enter the input1 :");
        String input3=in.nextLine();
        encodeThreeStrings(input1,input2,input3);
        }
        
      
}
