import java.util.Scanner;
class stock{
    String stackName;
    String stacksymbol;
    Double pstack;
    Double cstack;
    stock(String stackName,Double pstack,Double cstack){
        this.stackName=stackName;
        this.pstack=pstack;
        this.cstack=cstack;
        this.stacksymbol="$";
    }
    public Double getChangePercentage(){
         System.out.println("\nStock Name:"+stackName);
         System.out.println("previous Stock Price : "+pstack+" "+stacksymbol);
         System.out.println("Current Stock Price  : "+cstack+" "+stacksymbol);
        Double sum=((cstack-pstack)/cstack)*100;
        return sum;
    }
}
public class percentage_between_old_and_new_stock {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Stock Name : ");
        String stackName=in.nextLine().toUpperCase();

        System.out.print("Enter the Previous Stock Price: ");
        double pstack=in.nextDouble();

        System.out.print("Enter the Current Stock Price: ");
        double cstack=in.nextDouble();

        stock obj=new stock(stackName,pstack,cstack);
        System.out.println("\nGain in percentage : "+obj.getChangePercentage()+" %");
    }
}
