package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class mobileNumberValidation {
    public static void main(String[] args) {
        String str="919600388382";
        Boolean b =Pattern.compile("(0|91)?[6-9][0-9]{10}").matcher(str).find();
        System.out.println((b)?"valid Mobile Number":"IN Valid Mobile Number");
    }
}
