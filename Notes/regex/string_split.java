package regex;
import java.util.regex.*;
public class string_split {
    public static void main(String[] args) {
        String str="divakaran from.paramathi.velur ";
        String[] strarr=str.split("\\.");
        String[] stra=Pattern.compile("a").split(str);
        
        for (String string : stra) {
                System.out.println(string);
            }
    }
}
