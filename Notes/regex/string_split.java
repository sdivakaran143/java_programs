package regex;
import java.util.StringTokenizer;
import java.util.regex.*;
public class string_split {
    public static void main(String[] args) {
        String str="divakaran from paramathi-velur ";
        String[] stra=str.split("\\-");
        // String[] stra=Pattern.compile("a").split(str);
        
        for (String string : stra) {
            System.out.println(string);
        }
        //StringTokenizer Constructor 1
        StringTokenizer strizer1 =new StringTokenizer(str);
        System.out.println("There are "+strizer1.countTokens()+"  words");
        
        //StringTokenizer Constructor 2
        StringTokenizer strizer2 =new StringTokenizer("www.sdivakaran143.com",".");
        StringTokenizer strizer3 =new StringTokenizer("www.sdivakaran143.com",".",true);
        
        System.out.println("----------------------------------------------------------------");
        //PrintLoop
        // while (strizer3.hasMoreTokens()) {
        //     // System.out.println(strizer3.nextToken());
        // }
        //Split with 3 delimiters 
        // String astr[] =("https://www.sdivakaran143.com").split("\\:|\\.|\\//");
        // for (String string : astr) {
        //     System.out.println(string);
        // }
    }
}
