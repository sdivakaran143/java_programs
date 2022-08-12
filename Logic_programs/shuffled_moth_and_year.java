
/*

https://drive.google.com/file/d/1BajOsbPmKunjPYWCpoZDSeM-gb833ZL-/view?usp=sharing
*/
import java.util.*;

public class shuffled_moth_and_year {
    static Scanner in =new Scanner(System.in);
    static ArrayList<String> output=new ArrayList<String>();
    public static String charange(String ch){
        Boolean r=true;
        String[] month={"JAN","FEB","MAR","APR","MAY","JUN","JLY","AUG","SEP","OCT","NOV","DEC"};
        for(int i=0;i<11;i++){
            String s =new String(ch); 
            r=true;
            for(int j=0;j<3;j++){
            int res=s.indexOf(month[i].charAt(j));
                if(res==-1){
                 r=false;
                    break;
                }
            StringBuilder in=new StringBuilder(s);
            s=in.deleteCharAt(res).toString();
            }
            if(r){
                ch=month[i];
                break;
            }
            }
        return ch;
    }
    public static void monthYear(ArrayList<String> inp){

        String th=inp.get(2);
        String ch="";
        String num="";

        for(int i=0;i<th.length();i++){
            if(Character.isAlphabetic(th.charAt(i))){
                ch+=th.charAt(i);
            }else if(Character.isDigit(th.charAt(i))){
                num+=th.charAt(i);
            }
        }
        ch=charange(ch);
        int start= Integer.parseInt(inp.get(0));
        int stop= Integer.parseInt(inp.get(1));
  
        boolean r=true;
        for(int i=start;i<stop;i++){
            String year=Integer.toString(i);
            r=true;
            for(int j=0;j<4;j++){
            int res=year.indexOf(num.charAt(j));
                if(res==-1){
                 r=false;
                    break;
                }
            StringBuilder in=new StringBuilder(year);
            year=in.deleteCharAt(res).toString();
            }
            if(r){
                output.add(ch+"/"+i);
            }
            }
        }
    public static void main(String[] args) {
        ArrayList<String> input1 = new ArrayList<String>();

        System.out.print("Enter the Starting year :");
        String str=in.nextLine();
        input1.add(str);

        System.out.print("Enter the Ending year :");
        str=in.nextLine();
        input1.add(str);

        System.out.print("Enter the month and year :");
        str=in.nextLine().toUpperCase();
        input1.add(str);

        monthYear (input1 );

        System.out.println("Output 1 : ");
        for (String i : output) {
                System.out.print(i+" ");
        }
        System.out.println("\nOutput 2 : "+output.size());

    }
}
