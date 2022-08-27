import java.util.*;
public class minimum_cost_to_buy_N_apples {
    static Scanner in =new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("enter the Count : ");
        int c=in.nextInt();
        System.out.print("Enter the shop 1 quantity : ");
        double s1=in.nextInt();
        System.out.print("Enter the shop 1 price : ");
        double s1m=in.nextInt();
        System.out.print("Enter the shop 2 quantity : ");
        double s2=in.nextInt();
        System.out.print("Enter the shop 1 price : ");
        double s2m=in.nextInt();
        double sc=0,val=0;

        Double v1=(s1m/s1);
        Double v2=(s2m/s2);

        if(v1<v2){
            System.out.print("shop 1 is best Rs ");
            sc=s1;
            val=v1;
        }
        else{
            System.out.println("shop 1 is best Rs ");
            sc=s2;
            val=v2;
        }
        int m=0;
        for(int i=0;i<c;i++){
            if(m>=c){
                System.out.println((int)m*val);
                break;
            }
            else{
                m+=sc;
            }
        }

    
        //System.out.println(v1+" "+v2);
    }
}
