public class match_substring_with_given_stuing {
    public static void main(String[] args) {
        String match="fi_er";
        String str="filer:filter:fixer:tailor:offers";
        String marr[]=match.split("_");
        String sarr[]=str.split(":");
        for (String s : sarr) {
            if(s.substring(0,2).equals(marr[0]) && s.substring(s.length()-2).equals(marr[1])&& s.length()==5){
                System.out.print(s+":");
            }
        }
    }
}
