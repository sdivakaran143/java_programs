/* 
4) Calculate the total fine to be collected
Given a date and an array of integer containing the numbers of the cars traveling on
that date(an integer), the task is to calculate the total fine collected based on the
following rules:
 Odd numbered cars can travel on only odd dates.
 Even numbered cars on only even dates.
 Otherwise a car would be fined 250 Rs.
Examples:

Input: car_num[] = {3, 4, 1, 2}, date = 15
Output: 500
Car with numbers &amp;#39;4&amp;#39; and &amp;#39;2&amp;#39; will be fined
250 each.
Input: car_num[] = {1, 2, 3} , date = 16
Output: 500
Car with numbers &amp;#39;1&amp;#39; and &amp;#39;3&amp;#39; will be fined
250 each.
*/
import java.util.*;
public class fine_calculator {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the count of cars  :");
        int n=in.nextInt();
        int[] car=new int[n];
        int[] fine=new int[n];

        System.out.print("Enter the  cars numbers  :");
        for(int i=0;i<n;i++){
            car[i]=in.nextInt();
        }
        System.out.print("Enter the travel date :");
        int date =in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(car[i]%2==1&&date%2==1){
                continue;}
            if(car[i]%2==0&&date%2==0){
                continue;}
            fine[count]=car[i];
            count++;
        }
        System.out.print("the cars :");

        for(int i=0;i<count;i++){
            System.out.print(" "+fine[i]);
        }
        System.out.print(" has fine need to pay fine 250 \nTotal fine amount :"+count*250);




    }
}
