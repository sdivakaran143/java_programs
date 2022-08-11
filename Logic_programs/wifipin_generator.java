import java.util.*;
public class wifipin_generator {
    static Scanner in=new Scanner(System.in);
    static String pin="";
    public static String sumofroomnumber(String rono) { 
        int sum=0;
        while(sum==0||sum>9){
        for(int i=0;i<rono.length();i++){
            sum+=rono.charAt(i)-'0';
        }
        if(sum==1){
            sum=2;
        }
        else{
        }if(sum%2==0){
            return Integer.toString(sum);
        }else{
            return Integer.toString(sum-1);
        }}
         return Integer.toString(sum);
    }
    public static int  validate(int roomNo){
        while(roomNo<99||roomNo>1000){
            System.out.print("invalid room number \nre-enter the room number : ");
            roomNo=in.nextInt();
        }
        return roomNo;
    }

    public static void createWifiPin(int roomNo, String lastName) { 
        String spch=")!@#$%^&*(";
        String rono=Integer.toString(roomNo);
        pin+=rono.charAt(rono.length()-2);
        pin+=lastName.charAt(lastName.length()-1);
        pin+=spch.charAt((rono.charAt(rono.length()-3))-'0');
        pin+=sumofroomnumber(rono);
    }
    public static void main(String[] args) {
        System.out.print("Enter the RoomNo : ");
        int roomNo=in.nextInt();
        in.nextLine();
        System.out.print("Enter the LastName : ");
        String lastName=in.nextLine();
        roomNo= validate(roomNo);
        createWifiPin(roomNo,lastName);
        System.out.println("\nOutput : "+pin);
        in.close();
    }
}
