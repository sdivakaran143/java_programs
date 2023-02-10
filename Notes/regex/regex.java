package regex;
import java.util.regex.*;;
public class regex{
    public static void main(String[] args) {
            // String str="hello ksr makkalea hello solungga yellow color pidikummma...";
            String str="a84TY45csd7!@#%^*()";
            // Pattern ptrn = Pattern.compile("..$");

            //character classs------------------------------------------------------------------------
            // Pattern ptrn = Pattern.compile("[hsya]");
            // Pattern ptrn = Pattern.compile("[^c]");
            // Pattern ptrn = Pattern.compile("[0-5]");
            Pattern ptrn = Pattern.compile("[^a-zA-Z0-9]");
            Matcher m =ptrn.matcher(str);
            
            //predefined classes----------------------------------------------------------------------
            // str="hello my world@143 hellohelloMr what about today";
            str="abaaabbccaabbbbancanbbaabbaaabbavnabcabcnbca";
            Matcher mach=Pattern.compile("a{1,3}").matcher(str);

            while(mach.find()){
                // System.out.println(mach.group()+" => "+mach.start()+" - "+mach.end());
                System.out.println(mach.group()+" => "+mach.start());
            }
        }
    }
