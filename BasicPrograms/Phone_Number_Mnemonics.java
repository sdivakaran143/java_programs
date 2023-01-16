import java.util.*;
public class Phone_Number_Mnemonics {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nenter the number");
        String str=in.nextInt()+"";
        String dn[] ={"   ","   ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> arr= new ArrayList<String>();
        if(str.length()<=4&&str.length()>=0){
            for (int j = 0; j < str.length(); j++) {
                int  ch =str.charAt(j)-'0';
                for (int i = 0; i < dn[ch].length(); i++) {
                    try{
                        String val=arr.get(i);
                    arr.set(i,val+dn[ch].charAt(i));
                    }
                    catch(Exception e){
                        arr.add(""+dn[ch].charAt(i));
                    }
                }
            }
    
        }
        System.out.println(arr+"\n");
        
    }
}
