package DataStucture;
import java.util.*;
public class queue {
    static int size =6;
    static int[] arr =new int[size];
    static int front =0;
    static int rear =-1;
    static Scanner in=new Scanner(System.in);
    static  void enqueue(int val){
        if(isfull()){
            for(int i=front;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
        }
        arr[++rear]=val;
        System.out.println("\tenqueue value"+val+" is sucess...");
    }
    static  boolean isfull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }
    static  boolean isempty(){
        if(rear==front-1){
            return true;
        }
        return false;
    }
    
    static  void dequeue(){
        if(isempty()){
            System.out.println("\tQUEUE IS EMPTY");
        }else{
            rear--;
            System.out.println("\tDequeue Sucess...");
        }
    }
    static  void printqueue(){
        if(!isempty()){
            System.out.print("\n\t");
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else{
            System.out.println("\tQUEUE IS EMPTY");
        }
    }
    public static void main(String[] args) {
        for(;;){
            System.out.print("\n1.ENQUEUE\n2.DEQUEUE\n3.PRINT QUEUE\nENTER YOUR OPTION:");
            int choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter number to push");
                    int val=in.nextInt();
                    enqueue(val);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    printqueue();
                    break;
                default:
                    System.out.println("exited.....");
                    System.exit(0);
            }
        }

    }
    
}
