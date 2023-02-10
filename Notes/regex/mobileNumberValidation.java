package regex;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;
public class mobileNumberValidation {
    public static String validate(String str){
        Pattern ptrn=Pattern.compile("(0|9)?[6-9][0-9]{9}");
        Matcher mchr=ptrn.matcher(str);
        Boolean b =mchr.find();
       return (((b)?"valid Mobile Number":"IN Valid Mobile Number"));
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("D:\\2013021\\java_programs\\Notes\\regex\\test.txt");
        Scanner in =new Scanner(f);
        while(in.hasNext()){
            String str=in.next();
            str=str.substring(str.lastIndexOf(":")+1);
            // System.out.println(str.length());
            System.out.println(str+" is "+validate(str));
        }
        // String str="9876543210";
        // Pattern ptrn=Pattern.compile("^[6-9][0-9]{10}");
        // Matcher mchr=ptrn.matcher(str);
        // Boolean b =mchr.find();
        // System.out.println((b)?"valid Mobile Number":"IN Valid Mobile Number");
    }
}
