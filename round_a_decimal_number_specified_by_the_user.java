/*
1. Create a java program to round a decimal number specified by the user.
Input = 45.67843
n=3
output
45.678

Input=23.42611

n=2
output = 23.43 
 */
import java.util.*;
class round_a_decimal_number_specified_by_the_user{
    static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Decimal value : ");
        double d=in.nextDouble();
        System.out.print("Enter the round Value : ");
        int r=in.nextInt();
        int j=0;
        String res="";
        for(int i=0;i<Double.toString(d).length();i++,j++){

            if(Double.toString(d).charAt(j)=='.'){
                if(r==0){
                    if(Double.toString(d).charAt(j+1)<=5){
                        res=""+(Integer.parseInt(res)+1);
                        break;
                    }
                    if(Double.toString(d).charAt(j+1)>5){
                        res=""+(Integer.parseInt(res)-1);
                        break;
                    }
                }
            } 
            if(i==Double.toString(d).length()-1){
                res+=(Double.toString(d).charAt(j)-'0')+1;
            }
            else{
                res+=(Double.toString(d).charAt(j));
            }  
        }
        System.out.println("Output : "+res);
    }
}