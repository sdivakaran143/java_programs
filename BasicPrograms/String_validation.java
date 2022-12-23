/*
String validation 
*/
import java.util.*;
public class String_validation {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        Boolean res=false;
        System.out.print("Enter String :");
        String str =in.nextLine();
        if(str!=" "){
            String[] arr=str.split(" ");
            if(arr.length==1){
                if(str.length()>5&&15>str.length()){
                  res=true;
                }
            }
        }
        if(res==true){
            System.out.println("the String \" "+str+"\"is valid");        
        }else{
            System.out.println("the String \" "+str+"\"is not valid");        
        }

    }
}
