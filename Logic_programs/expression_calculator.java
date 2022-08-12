import java.util.*;
public class expression_calculator { 
    static Scanner in =new Scanner(System.in);
    static int sum=0;
    static  LinkedList<String> arr = new LinkedList<String>();


    public static void call(char ch,int i){
        sum=0;
        switch(ch){
            case '+':
                sum=Integer.parseInt(arr.get(i-1))+Integer.parseInt( arr.get(i+1));
                break;
            case '-':
                sum=Integer.parseInt( arr.get(i-1))-Integer.parseInt( arr.get(i+1));
                break;
            case '*':
                sum=Integer.parseInt( arr.get(i-1))*Integer.parseInt( arr.get(i+1));
                break;
            case '/':
                sum=Integer.parseInt( arr.get(i-1))/Integer.parseInt( arr.get(i+1));
                break;
        }
    }
    public static void took(){
        for(int i=1;i<arr.size();i++){
            char ch=arr.get(i).charAt(0);
            if(Character.isDigit(ch)){
            }else{
                call(ch,i);
                arr.remove(i);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.addFirst(Integer.toString(sum));
                i=0;
            }
        }
    }
    public static String  compute_brackets(String str){
        while(true){
        int pos=str.indexOf("(");
        if(pos>-1){
            int pos2=str.indexOf(")");
            String str2=str.substring(pos+1, pos2)+"_";
            to_link_list(str2);
            arr.remove(arr.size()-1);
            if(arr.size()==1){
                sum=Integer.parseInt(arr.get(0));
            }
            else{
                took();
            }
            arr.clear();
            if(pos==0&&Character.isDigit(str.charAt(pos2+1))){
                str=str.substring(0,pos)+sum+"*"+str.substring(pos2+1);
            }else if(pos==0){
                str=str.substring(0,pos)+sum+str.substring(pos2+1);
            }else if(Character.isDigit(str.charAt(pos-1))){
                    str=str.substring(0,pos)+"*"+sum+str.substring(pos2+1);
            }
            else{
                str=str.substring(0,pos)+sum+str.substring(pos2+1);
            }
        }
        else{
            break;
        }
        }

        return str;
    } 
    public static void  to_link_list(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
            }
            else{
                arr.add(str.substring(0, i));
                arr.add(""+ch);
                str=str.substring(i+1);
                i=-1;
                continue;
            }
        }
    }
    public static void precedence_perform(){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals("*")||arr.get(i).equals("/")){
                call(arr.get(i).charAt(0),i);
                arr.remove(i);
                arr.remove(i-1);
                arr.remove(i-1);
                arr.add(i-1, ""+sum);
                i=0;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the String :");
        String str=in.nextLine();
        str+="_";
        str=compute_brackets(str);
        to_link_list(str);
        arr.remove(arr.size()-1);
        precedence_perform();
        took();
        System.out.println("Output : "+sum);
    }
}
