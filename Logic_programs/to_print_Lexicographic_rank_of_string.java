import java.util.*;
public class to_print_Lexicographic_rank_of_string {
    static Scanner in =new Scanner(System.in);
    static int fact(int n){
		int fact=1;
		while(n>0){
			fact*=n;
			n--;
		}
		return fact;
	}
    static String shuffle(String str){
        char[] ch=str.toCharArray();
        Random r=new Random();
        int ran =r.nextInt(str.length());
        int ra =r.nextInt(str.length());
        char temp=ch[ran];
        ch[ran]=ch[ra];
        ch[ra]=temp;
        str=new String(ch);
        return str;
    } 
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        String strmain =in.nextLine();
        String str =strmain;
        HashSet<String> hs=new HashSet<String>();
        int f= fact(str.length());
        while (true) {
            str=shuffle(str);
            hs.add(str);
            if(hs.size()==f){
                break;
            }
        }
        ArrayList<String> List= new ArrayList<String>(hs);
        Collections.sort(List);
        for (int i = 0; i < List.size(); i++) {
            //System.out.println(List.get(i));
           if(List.get(i).equals(strmain)){
               System.out.println("Position : "+(i+1));
           }
        }
    }
}
