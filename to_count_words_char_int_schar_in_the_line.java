import java.util.*;

class to_count_words_char_int_schar_in_the_line {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter the input : ");
        String str = in.nextLine();
        String v = "AEIOU";
        int vc = 0, cc = 0, sc = 0, dc = 0, tcc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (v.contains("" + ch)) {
                tcc++;
                vc++;
                continue;
            }
            if (Character.isAlphabetic(ch)) {
                tcc++;
                cc++;
                continue;
            } else if (Character.isDigit(ch)) {
                dc++;
                continue;
            }
            sc++;
        }
        int wordcount = str.split(" ").length;
        System.out.println("vowels : " + vc + "\ncharacters : " + cc + "\nspecial Character : " + sc
                + "\nDigit Count : " + dc + "\nTOtal count characters : " + tcc + "\nword counts :  " + wordcount);
    }
}