import java.util.*;
public class minimum_cost_to_buy_N_apples {
    static Scanner in =new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("enter the Count : ");
        int c=in.nextInt();
        System.out.print("Enter the shop 1 quantity : ");
        int s1=in.nextInt();
        System.out.print("Enter the shop 1 price : ");
        int s1m=in.nextInt();
        System.out.print("Enter the shop 2 quantity : ");
        int s2=in.nextInt();
        System.out.print("Enter the shop 1 price : ");
        int s2m=in.nextInt();
        int sc=0,val=0;

        int v1=(s1m/s1);
        int v2=(s2m/s2);

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
                System.out.println(m*val);
                break;
            }
            else{
                m+=sc;
            }
        }

    
        //System.out.println(v1+" "+v2);
    }
}
